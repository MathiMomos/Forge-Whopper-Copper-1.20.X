package net.mathimomos.whopper_copper.item.custom;

import net.mathimomos.whopper_copper.config.ModConfigs;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class OxidizingSwordItem extends SwordItem {
    private final Item nextStateItem;
    private static final int OXIDATION_TIME = ModConfigs.OXIDATION_TIME.get();

    public OxidizingSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties, Item nextStateItem) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
        this.nextStateItem = nextStateItem;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (!pLevel.isClientSide && pEntity instanceof Player player) {
            if (pStack.getTag() != null && pStack.getTag().contains("oxidation_time")) {
                int TranscurredTicksOxidation = pStack.getTag().getInt("oxidation_time");
                TranscurredTicksOxidation++;
                if (TranscurredTicksOxidation >= OXIDATION_TIME) {
                    ItemStack oxidizedTool = new ItemStack(nextStateItem);
                    oxidizedTool.setDamageValue(pStack.getDamageValue());
                    if (pStack.hasCustomHoverName()) {
                        oxidizedTool.setHoverName(pStack.getHoverName());
                    }
                    player.getInventory().setItem(pSlotId, oxidizedTool);
                } else {
                    pStack.getTag().putInt("oxidation_time", TranscurredTicksOxidation);
                }
            } else {
                pStack.getOrCreateTag().putLong("oxidation_time", 0);
            }
        }
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return oldStack.getItem() != newStack.getItem();
    }
}