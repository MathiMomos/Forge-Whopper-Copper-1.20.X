package net.mathimomos.whopper_copper.item.custom;

import net.mathimomos.whopper_copper.WhopperCopper;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OxidizingArmorItem extends ArmorItem {
    private final Item nextStateItem;
    private int oxidationTime = 0;

    public OxidizingArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, Item nextStateItem) {
        super(pMaterial, pType, pProperties);
        this.nextStateItem = nextStateItem;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (WhopperCopper.COMMON_CONFIG.oxidationEnabled.get() && !pLevel.isClientSide && pEntity instanceof Player pPlayer) {
            boolean isInInventory = pSlotId < pPlayer.getInventory().items.size();

            if (pSlotId == 0 || pSlotId == 1 || pSlotId == 2 || pSlotId == 3 || isInInventory) {
                if(oxidationTime >= WhopperCopper.COMMON_CONFIG.oxidationTime.get() * 20) {
                    transformToOxidized(pStack, pPlayer, pSlotId);
                } else {
                    oxidationTime++;
                }
            }
        }
    }

    private void transformToOxidized(ItemStack pStack, Player pPlayer, int pSlotId) {
        ItemStack oxidizedPiece = new ItemStack(nextStateItem);

        oxidizedPiece.setDamageValue(pStack.getDamageValue());
        if (pStack.hasCustomHoverName()) {
            oxidizedPiece.setHoverName(pStack.getHoverName());
        }
        if (pStack.getTag() != null && pStack.getTag().contains("Trim")) {
            oxidizedPiece.getOrCreateTag().put("Trim", pStack.getTag().get("Trim"));
        }
        if (pSlotId >= 0 && pSlotId < 4) {
            pStack.shrink(1);
            pPlayer.getInventory().armor.set(pSlotId, oxidizedPiece);
        }
        if (pSlotId >= 4 && pSlotId < pPlayer.getInventory().items.size()) {
            pStack.shrink(1);
            pPlayer.getInventory().items.set(pSlotId, oxidizedPiece);
        }
    }

}
