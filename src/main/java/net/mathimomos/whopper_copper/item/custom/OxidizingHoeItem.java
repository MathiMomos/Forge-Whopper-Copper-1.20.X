package net.mathimomos.whopper_copper.item.custom;

import net.mathimomos.whopper_copper.WhopperCopper;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class OxidizingHoeItem extends HoeItem {
    private final Item nextStateItem;
    private int oxidationTime = 0;

    public OxidizingHoeItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties, Item nextStateItem) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
        this.nextStateItem = nextStateItem;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (WhopperCopper.COMMON_CONFIG.oxidationEnabled.get() && !pLevel.isClientSide && pEntity instanceof Player pPlayer) {
            if (oxidationTime >= WhopperCopper.COMMON_CONFIG.oxidationTime.get() * 20) {
                transformToOxidized(pStack, pPlayer, pSlotId);
            } else {
                oxidationTime++;
            }
        }
    }

    private void transformToOxidized(ItemStack pStack, Player player, int pSlotId) {
        ItemStack oxidizedTool = new ItemStack(nextStateItem);

        oxidizedTool.setDamageValue(pStack.getDamageValue());

        if (pStack.hasCustomHoverName()) {
            oxidizedTool.setHoverName(pStack.getHoverName());
        }

        if (pStack.getTag() != null) {
            oxidizedTool.getOrCreateTag().merge(pStack.getTag());
        }

        player.getInventory().setItem(pSlotId, oxidizedTool);
    }
}