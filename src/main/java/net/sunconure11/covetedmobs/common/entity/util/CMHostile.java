package net.sunconure11.covetedmobs.common.entity.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public abstract class CMHostile extends HostileEntity {
	protected CMHostile(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
	}
}
