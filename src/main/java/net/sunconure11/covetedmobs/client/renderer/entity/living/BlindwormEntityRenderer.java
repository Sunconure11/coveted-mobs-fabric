package net.sunconure11.covetedmobs.client.renderer.entity.living;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.sunconure11.covetedmobs.CovetedMobs;
import net.sunconure11.covetedmobs.client.model.entity.living.BlindwormModel;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;

@Environment(EnvType.CLIENT)
public class BlindwormEntityRenderer extends MobEntityRenderer<BlindwormEntity, BlindwormModel<BlindwormEntity>> {
	private static final Identifier TEXTURE = new Identifier(CovetedMobs.MODID, "textures/entity/living/blindworm.png");

	public BlindwormEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new BlindwormModel<>(), 0.5f);
	}

	@Override
	public Identifier getTexture(BlindwormEntity entity) {
		return TEXTURE;
	}
}
