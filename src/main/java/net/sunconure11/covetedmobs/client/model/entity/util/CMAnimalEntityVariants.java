package net.sunconure11.covetedmobs.client.model.entity.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public abstract class CMAnimalEntityVariants extends AnimalEntity {
	protected CMAnimalEntityVariants(EntityType<? extends AnimalEntity> entityType, World world) {
		super(entityType, world);
	}
}
