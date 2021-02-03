package net.sunconure11.covetedmobs.common.entity.living;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.sunconure11.covetedmobs.client.model.entity.util.CMAnimalEntity;
import org.jetbrains.annotations.Nullable;

public class BlindwormEntity extends CMAnimalEntity {

	protected BlindwormEntity(EntityType<? extends AnimalEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
		return null;
	}
}
