package net.sunconure11.covetedmobs.client.renderer.entity.living;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.sunconure11.covetedmobs.client.model.entity.living.BlindwormModel;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;

@Environment(EnvType.CLIENT)
public class BlindwormEntityRenderer extends MobEntityRenderer<BlindwormEntity, BlindwormModel<BlindwormEntity>> {

	public BlindwormEntityRenderer(EntityRenderDispatcher entityRenderDispatcher, BlindwormModel<BlindwormEntity> entityModel, float f) {
		super(entityRenderDispatcher, entityModel, f);
	}

	@Override
	public Identifier getTexture(BlindwormEntity entity) {
		return null;
	}
}
