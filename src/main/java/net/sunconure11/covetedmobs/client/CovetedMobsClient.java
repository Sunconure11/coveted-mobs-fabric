package net.sunconure11.covetedmobs.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.sunconure11.covetedmobs.client.renderer.entity.living.BlindwormEntityRenderer;
import net.sunconure11.covetedmobs.common.registry.CMEntityTypes;

public class CovetedMobsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.INSTANCE.register(CMEntityTypes.BLINDWORM, (dispatcher, context) -> new BlindwormEntityRenderer(dispatcher));
	}
}
