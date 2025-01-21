package net.mathimomos.whopper_copper.item;

import net.mathimomos.whopper_copper.WhopperCopper;
import net.mathimomos.whopper_copper.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhopperCopper.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WHOPPER_COPPER_TAB =CREATIVE_MODE_TABS.register("whopper_copper_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.COPPER_INGOT))
            .title(Component.translatable("whopper_copper.whopper_copper_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.COPPER_SWORD.get());
                pOutput.accept(ModItems.COPPER_PICKAXE.get());
                pOutput.accept(ModItems.COPPER_AXE.get());
                pOutput.accept(ModItems.COPPER_SHOVEL.get());
                pOutput.accept(ModItems.COPPER_HOE.get());

                pOutput.accept(ModItems.COPPER_HELMET.get());
                pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.COPPER_BOOTS.get());

                pOutput.accept(ModItems.EXPOSED_COPPER_SWORD.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_AXE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_HOE.get());

                pOutput.accept(ModItems.EXPOSED_COPPER_HELMET.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_BOOTS.get());

                pOutput.accept(ModItems.WEATHERED_COPPER_SWORD.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_AXE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_HOE.get());

                pOutput.accept(ModItems.WEATHERED_COPPER_HELMET.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_BOOTS.get());

                pOutput.accept(ModItems.OXIDIZED_COPPER_SWORD.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_AXE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_HOE.get());

                pOutput.accept(ModItems.OXIDIZED_COPPER_HELMET.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_BOOTS.get());
            })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
