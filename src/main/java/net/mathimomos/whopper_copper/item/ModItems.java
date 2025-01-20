package net.mathimomos.whopper_copper.item;

import net.mathimomos.whopper_copper.WhopperCopper;
import net.mathimomos.whopper_copper.item.custom.*;
import net.mathimomos.whopper_copper.util.ModToolTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WhopperCopper.MOD_ID);

    public static final RegistryObject<Item> OXIDIZED_COPPER_HELMET = ITEMS.register("oxidized_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_CHESTPLATE = ITEMS.register("oxidized_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_LEGGINGS = ITEMS.register("oxidized_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BOOTS = ITEMS.register("oxidized_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WEATHERED_COPPER_HELMET = ITEMS.register("weathered_copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.OXIDIZED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_CHESTPLATE = ITEMS.register("weathered_copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.OXIDIZED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_LEGGINGS = ITEMS.register("weathered_copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.OXIDIZED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BOOTS = ITEMS.register("weathered_copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.OXIDIZED_COPPER_BOOTS.get()));

    public static final RegistryObject<Item> EXPOSED_COPPER_HELMET = ITEMS.register("exposed_copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.WEATHERED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_CHESTPLATE = ITEMS.register("exposed_copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.WEATHERED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_LEGGINGS = ITEMS.register("exposed_copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.WEATHERED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BOOTS = ITEMS.register("exposed_copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.WEATHERED_COPPER_BOOTS.get()));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties(), ModItems.EXPOSED_COPPER_HELMET.get()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ModItems.EXPOSED_COPPER_CHESTPLATE.get()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties(), ModItems.EXPOSED_COPPER_LEGGINGS.get()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new OxidizingArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties(), ModItems.EXPOSED_COPPER_BOOTS.get()));

    public static final RegistryObject<Item> OXIDIZED_COPPER_SWORD = ITEMS.register("oxidized_copper_sword",
            () -> new SwordItem(ModToolTiers.OXIDIZED_COPPER, 4, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_PICKAXE = ITEMS.register("oxidized_copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OXIDIZED_COPPER, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_AXE = ITEMS.register("oxidized_copper_axe",
            () -> new AxeItem(ModToolTiers.OXIDIZED_COPPER, 7.5F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_SHOVEL = ITEMS.register("oxidized_copper_shovel",
            () -> new ShovelItem(ModToolTiers.OXIDIZED_COPPER, 2.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_HOE = ITEMS.register("oxidized_copper_hoe",
            () -> new HoeItem(ModToolTiers.OXIDIZED_COPPER, 0, -1F, new Item.Properties()));

    public static final RegistryObject<Item> WEATHERED_COPPER_SWORD = ITEMS.register("weathered_copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.WEATHERED_COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_PICKAXE = ITEMS.register("weathered_copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.WEATHERED_COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_AXE = ITEMS.register("weathered_copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.WEATHERED_COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_AXE.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_SHOVEL = ITEMS.register("weathered_copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.WEATHERED_COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> WEATHERED_COPPER_HOE = ITEMS.register("weathered_copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.WEATHERED_COPPER, 0, -1F, new Item.Properties(),
                    ModItems.OXIDIZED_COPPER_HOE.get()));

    public static final RegistryObject<Item> EXPOSED_COPPER_SWORD = ITEMS.register("exposed_copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.EXPOSED_COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_PICKAXE = ITEMS.register("exposed_copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.EXPOSED_COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_AXE = ITEMS.register("exposed_copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.EXPOSED_COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_AXE.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_SHOVEL = ITEMS.register("exposed_copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.EXPOSED_COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> EXPOSED_COPPER_HOE = ITEMS.register("exposed_copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.EXPOSED_COPPER, 0, -1F, new Item.Properties(),
                    ModItems.WEATHERED_COPPER_HOE.get()));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new OxidizingSwordItem(ModToolTiers.COPPER, 4, -2.4F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_SWORD.get()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new OxidizingPickaxeItem(ModToolTiers.COPPER, 2, -2.8F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_PICKAXE.get()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new OxidizingAxeItem(ModToolTiers.COPPER, 7.5F, -3.1F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_AXE.get()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new OxidizingShovelItem(ModToolTiers.COPPER, 2.5f, -3F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_SHOVEL.get()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new OxidizingHoeItem(ModToolTiers.COPPER, 0, -1F, new Item.Properties(),
                    ModItems.EXPOSED_COPPER_HOE.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
