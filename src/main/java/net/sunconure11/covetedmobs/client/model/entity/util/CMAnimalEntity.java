package net.sunconure11.covetedmobs.client.model.entity.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public abstract class CMAnimalEntity extends AnimalEntity {

	protected CMAnimalEntity(EntityType<? extends AnimalEntity> entityType, World world) {
		super(entityType, world);
	}
}
