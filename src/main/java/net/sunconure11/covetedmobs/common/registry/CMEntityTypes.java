package net.sunconure11.covetedmobs.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sunconure11.covetedmobs.CovetedMobs;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class CMEntityTypes {
	private static final Map<EntityType<?>, Identifier> ENTITY_TYPES = new LinkedHashMap<>();

	public static final EntityType<BlindwormEntity> BLINDWORM = create("blindworm", BlindwormEntity.createAttributes(), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BlindwormEntity::new).dimensions(EntityDimensions.changing(0.5f, 0.5f)).build());

	private static <T extends LivingEntity> EntityType<T> create(String name, DefaultAttributeContainer.Builder attributes, EntityType<T> type) {
		FabricDefaultAttributeRegistry.register(type, attributes);
		ENTITY_TYPES.put(type, new Identifier(CovetedMobs.MODID, name));
		return type;
	}

	private static <T extends Entity> EntityType<T> create(String name, EntityType<T> type) {
		ENTITY_TYPES.put(type, new Identifier(CovetedMobs.MODID, name));
		return type;
	}

	public static void init() {
		ENTITY_TYPES.keySet().forEach(entityType -> Registry.register(Registry.ENTITY_TYPE, ENTITY_TYPES.get(entityType), entityType));
	}
}
