package net.boris.tinmod.client.rederer;

import net.boris.tinmod.TinMod;
import net.boris.tinmod.entities.AncientGuardian;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AncientGuardianEntityRenderer extends MobRenderer<AncientGuardian, AncientGuardianModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TinMod.MOD_ID, "textures/entities/ancient guardian.png");

    public AncientGuardianEntityRenderer(EntityRendererProvider.Context ctx) {
        super (ctx, new AncientGuardianModel(), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AncientGuardian entity) {
        return TEXTURE;
    }
}
