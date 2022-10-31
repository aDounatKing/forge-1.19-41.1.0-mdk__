package net.boris.tinmod.item;

import net.boris.tinmod.TinMod;
import net.boris.tinmod.base.ModArmorMaterial;
import net.boris.tinmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModItems<sup> {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TinMod.MOD_ID);


    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(props()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(props()));
    public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod",
            () -> new Item(props()));
    public static final RegistryObject<Item> ADAMITE = ITEMS.register("adamite",
            () -> new Item(props()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(props()));

    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword",
            () -> new SwordItem(ToolTiers.TIN, 5,1.2f, props()));
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            () -> new PickaxeItem(ToolTiers.TIN, 3,1.2f, props()));
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe",
            () -> new AxeItem(ToolTiers.TIN, 7,0.9f, props()));
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel",
            () -> new ShovelItem(ToolTiers.TIN, 2,1f, props()));
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe",
            () -> new HoeItem(ToolTiers.TIN, 1,1f, props()));

    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ToolTiers2.BRONZE, 1,1f, props()));
    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ToolTiers2.BRONZE, 7,0.9f, props()));
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ToolTiers2.BRONZE, 3,0.9f, props()));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL= ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ToolTiers2.BRONZE, 2,1f, props()));



    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.FEET, props()));
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.LEGS, props()));




    private static Item.@NotNull Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.TIN_TAB);
    }

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);



        }

    public static class ToolTiers {
        public static final Tier TIN = new ForgeTier(
                3,
                700,
                0f,
                1,
                22,
                ModBlocks.Tags.NEEDS_TIN_TOOL,
                () -> Ingredient.of(ModItems.TIN.get()));

        }

    public static class ToolTiers2 {
        public static final Tier BRONZE = new ForgeTier(
                0,
                500,
                0f,
                1,
                22,
                ModBlocks.Tags.NEEDS_BRONZE_TOOL,
                () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    }





    public static class ArmorTiers {
        public static final ArmorMaterial TIN = new ModArmorMaterial(
            "tin",
            750,
            new int[] { 2, 7, 6, 3 },
            30,
            SoundEvents.ARMOR_EQUIP_CHAIN,
            1.5f,
            0f,
            () -> Ingredient.of(ModItems.TIN.get())

        );
    }


}

