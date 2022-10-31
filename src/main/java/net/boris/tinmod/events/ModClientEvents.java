package net.boris.tinmod.events;

import net.boris.tinmod.client.rederer.AncientGuardianEntityRenderer;
import net.boris.tinmod.entities.AncientGuardian;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModClientEvents {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AncientGuardian.getAncientGuardianAttributes(), AncientGuardianEntityRenderer::new);
    }
}
