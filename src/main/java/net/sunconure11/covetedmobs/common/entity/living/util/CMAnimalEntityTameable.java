package net.sunconure11.covetedmobs.common.entity.living.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.world.World;

public abstract class CMAnimalEntityTameable extends TameableEntity {
	protected CMAnimalEntityTameable(EntityType<? extends TameableEntity> entityType, World world) {
		super(entityType, world);
	}
}
