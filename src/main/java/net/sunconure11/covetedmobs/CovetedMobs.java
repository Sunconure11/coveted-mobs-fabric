package net.sunconure11.covetedmobs;

import net.fabricmc.api.ModInitializer;
import net.sunconure11.covetedmobs.common.registry.CMEntityTypes;

public class CovetedMobs implements ModInitializer {
	public static final String MODID = "covetedmobs";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		CMEntityTypes.init();
		System.out.println("Hello Fabric world!");
	}
}
