package net.mathimomos.whopper_copper.datagen;

import net.mathimomos.whopper_copper.WhopperCopper;
import net.mathimomos.whopper_copper.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, WhopperCopper.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.COPPER_HELMET.get(),
                        ModItems.COPPER_CHESTPLATE.get(),
                        ModItems.COPPER_LEGGINGS.get(),
                        ModItems.COPPER_BOOTS.get(),

                        ModItems.EXPOSED_COPPER_HELMET.get(),
                        ModItems.EXPOSED_COPPER_CHESTPLATE.get(),
                        ModItems.EXPOSED_COPPER_LEGGINGS.get(),
                        ModItems.EXPOSED_COPPER_BOOTS.get(),

                        ModItems.WEATHERED_COPPER_HELMET.get(),
                        ModItems.WEATHERED_COPPER_CHESTPLATE.get(),
                        ModItems.WEATHERED_COPPER_LEGGINGS.get(),
                        ModItems.WEATHERED_COPPER_BOOTS.get(),

                        ModItems.OXIDIZED_COPPER_HELMET.get(),
                        ModItems.OXIDIZED_COPPER_CHESTPLATE.get(),
                        ModItems.OXIDIZED_COPPER_LEGGINGS.get(),
                        ModItems.OXIDIZED_COPPER_BOOTS.get()
                );
    }
}
