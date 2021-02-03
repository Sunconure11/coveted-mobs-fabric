package net.sunconure11.covetedmobs.client.model.entity.living;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import net.sunconure11.covetedmobs.CovetedMobs;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@Environment(EnvType.CLIENT)
public class BlindwormModel extends AnimatedGeoModel<BlindwormEntity> {
	public BlindwormModel() {
	}

	@Override
	public Identifier getModelLocation(BlindwormEntity blindwormEntity) {
		return new Identifier(CovetedMobs.MODID, "geo/blindworm.geo.json");
	}

	@Override
	public Identifier getTextureLocation(BlindwormEntity blindwormEntity) {
		return new Identifier(CovetedMobs.MODID, "textures/entity/living/blindworm.png");
	}

	@Override
	public Identifier getAnimationFileLocation(BlindwormEntity blindwormEntity) {
		return new Identifier(CovetedMobs.MODID, "animations/blindworm.json");
	}
}