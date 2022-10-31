package net.boris.tinmod.block;

import com.mojang.datafixers.types.templates.Tag;
import net.boris.tinmod.TinMod;
import net.boris.tinmod.item.ModCreativeModeTab;
import net.boris.tinmod.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, TinMod.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = RegisterBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TIN_TAB);
    public static final RegistryObject<Block> TIN_ORE = RegisterBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.TIN_TAB);
    public static final RegistryObject<Block> ADAMITE_ORE = RegisterBlock("adamite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(10, 15)), ModCreativeModeTab.TIN_TAB);

    private static <T extends Block>RegistryObject<T> RegisterBlock(String name, Supplier<T> block, CreativeModeTab tab) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static class Tags {
        public static final TagKey<Block> NEEDS_TIN_TOOL = create("mineable/needs_tin_tool");
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = create("mineable/needs_bronze_tool");


        private static @NotNull TagKey<Block> create(String location) {
            return BlockTags.create(new ResourceLocation(TinMod.MOD_ID, location));

            }
        }


        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }

}


