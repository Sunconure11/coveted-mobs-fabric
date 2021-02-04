package net.sunconure11.covetedmobs.common.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.size.FeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.sunconure11.covetedmobs.CovetedMobs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CMWorldSpawns {
	private static final Map<ConfiguredFeature<?, ?>, Identifier> CONFIGURED_FEATURES = new LinkedHashMap<>();

	private static final FeatureSize EMPTY_SIZE = new TwoLayersFeatureSize(0, 0, 0);

	private static <T extends FeatureConfig> ConfiguredFeature<T, ?> create(String name, ConfiguredFeature<T, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(configuredFeature, new Identifier(CovetedMobs.MODID, name));
		return configuredFeature;
	}

	public static void init() {
		CONFIGURED_FEATURES.keySet().forEach(configuredFeature -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, CONFIGURED_FEATURES.get(configuredFeature), configuredFeature));
		BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld().and(context -> CovetedMobs.config.blindwormBiomeCategories.contains(context.getBiome().getCategory().getName())), CMEntityTypes.BLINDWORM.getSpawnGroup(), CMEntityTypes.BLINDWORM, CovetedMobs.config.blindwormWeight, CovetedMobs.config.blindwormMinGroupCount, CovetedMobs.config.blindwormMaxGroupCount);
	}
}
