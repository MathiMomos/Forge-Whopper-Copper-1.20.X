package net.mathimomos.whopper_copper.datagen;


import net.mathimomos.whopper_copper.WhopperCopper;
import net.mathimomos.whopper_copper.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WhopperCopper.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockBottomTopWithItem(RegistryObject<Block> blockRegistryObject){
        ResourceLocation side = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath());
        ResourceLocation bottom = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_bottom");
        ResourceLocation top = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_top");
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop(blockRegistryObject.getId().getPath(), side, bottom, top));
    }
    private void blockDifferentWithItem(RegistryObject<Block> blockRegistryObject, boolean rotation) {
        ResourceLocation down = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath()+ "_down");
        ResourceLocation up = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_up");
        ResourceLocation north = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_north");
        ResourceLocation south = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_south");
        ResourceLocation west = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_west");
        ResourceLocation east = new ResourceLocation(WhopperCopper.MOD_ID, "block/" + blockRegistryObject.getId().getPath() + "_east");
        simpleBlockItem(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        if (rotation){
            horizontalBlock(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        } else {
            simpleBlock(blockRegistryObject.get(), models().cube(blockRegistryObject.getId().getPath(), down, up, north, south, west, east).texture("particle", north));
        }

    }
}
