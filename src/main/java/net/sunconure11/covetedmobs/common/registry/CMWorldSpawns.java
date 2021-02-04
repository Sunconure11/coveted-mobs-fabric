package net.sunconure11.covetedmobs.common.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.sunconure11.covetedmobs.CovetedMobs;

public class CMWorldSpawns {
	public static void init() {
		BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld().and(context -> CovetedMobs.config.blindwormBiomeCategories.contains(context.getBiome().getCategory().getName())), CMEntityTypes.BLINDWORM.getSpawnGroup(), CMEntityTypes.BLINDWORM, CovetedMobs.config.blindwormWeight, CovetedMobs.config.blindwormMinGroupCount, CovetedMobs.config.blindwormMaxGroupCount);
	}
}
