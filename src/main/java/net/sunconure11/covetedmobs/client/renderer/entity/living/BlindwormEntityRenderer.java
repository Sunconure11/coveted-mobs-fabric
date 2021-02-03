package net.sunconure11.covetedmobs.client.renderer.entity.living;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.sunconure11.covetedmobs.client.model.entity.living.BlindwormModel;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class BlindwormEntityRenderer extends GeoEntityRenderer<BlindwormEntity> {
	public BlindwormEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new BlindwormModel());
		this.shadowRadius = 0.7F;
	}
}
