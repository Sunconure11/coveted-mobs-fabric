package net.sunconure11.covetedmobs.common;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import net.minecraft.world.biome.Biome;
import net.sunconure11.covetedmobs.CovetedMobs;

import java.util.Arrays;
import java.util.List;

@Config(name = CovetedMobs.MODID)
public class CMConfig implements ConfigData {
	public final List<String> blindwormBiomeCategories = Arrays.asList(Biome.Category.PLAINS.getName(), Biome.Category.FOREST.getName());
	public final int blindwormWeight = 10;
	public final int blindwormMinGroupCount = 0;
	public final int blindwormMaxGroupCount = 4;
}
