package net.boris.tinmod;

import net.boris.tinmod.entities.AncientGuardian;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TinMod.MOD_ID);

    public static final RegistryObject<EntityType<AncientGuardian>> ANCIENTGUARDIAN = ENTITIES.register("ancient_guardian",
            () -> EntityType.Builder.of(AncientGuardian::new, MobCategory.WATER_CREATURE).build(TinMod.MOD_ID + ":ancient_guardian"));
}
