package net.sunconure11.covetedmobs;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.sunconure11.covetedmobs.common.CMConfig;
import net.sunconure11.covetedmobs.common.registry.CMEntityTypes;
import net.sunconure11.covetedmobs.common.registry.CMWorldSpawns;

public class CovetedMobs implements ModInitializer {
	public static final String MODID = "covetedmobs";
	public static CMConfig config;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		AutoConfig.register(CMConfig.class, GsonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(CMConfig.class).getConfig();
		CMEntityTypes.init();
		CMWorldSpawns.init();
		System.out.println("Hello Fabric world!");
	}
}
