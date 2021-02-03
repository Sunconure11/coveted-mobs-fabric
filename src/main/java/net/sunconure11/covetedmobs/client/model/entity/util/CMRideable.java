package net.sunconure11.covetedmobs.client.model.entity.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.JumpingMount;
import net.minecraft.entity.Saddleable;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.inventory.InventoryChangedListener;
import net.minecraft.world.World;

public abstract class CMRideable extends AnimalEntity implements InventoryChangedListener, JumpingMount, Saddleable {
	protected CMRideable(EntityType<? extends AnimalEntity> entityType, World world) {
		super(entityType, world);
	}
}
