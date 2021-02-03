package net.sunconure11.covetedmobs.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sunconure11.covetedmobs.CovetedMobs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CMEntityTypes {
	private static final Map<EntityType<?>, Identifier> ENTITY_TYPES = new LinkedHashMap<>();

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
