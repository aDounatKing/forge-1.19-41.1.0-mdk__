package net.boris.tinmod.events;

import net.boris.tinmod.ModEntity;
import net.boris.tinmod.entities.AncientGuardian;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public class ModCommonEvents {



    @SubscribeEvent
    public static void entityAttributes(@NotNull EntityAttributeCreationEvent event) {
        event.put(ModEntity.ANCIENTGUARDIAN.get(), AncientGuardian.getAncientGuardianAttributes().build());
    }

}
