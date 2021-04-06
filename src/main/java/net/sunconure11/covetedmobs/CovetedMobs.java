package net.sunconure11.covetedmobs;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.sunconure11.covetedmobs.common.CMConfig;
import net.sunconure11.covetedmobs.common.registry.CMEntityTypes;
import net.sunconure11.covetedmobs.common.registry.CMObjects;
import net.sunconure11.covetedmobs.common.registry.CMWorldSpawns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CovetedMobs implements ModInitializer {

	public static final String MODID = "covetedmobs";
	public static final Logger logger = LogManager.getLogger(MODID);
	public static final ItemGroup COVETED_MOBS_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(Items.MUTTON));
	public static CMConfig config;

	@Override
	public void onInitialize() {

		AutoConfig.register(CMConfig.class, GsonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(CMConfig.class).getConfig();
		CMEntityTypes.init();
		CMWorldSpawns.init();
		CMObjects.init();

		logger.info("We need another and a wiser and perhaps a more mystical concept of animals.");
		logger.info("Remote from universal nature, and living by complicated artifice, man in civilization surveys the creature through the glass of his knowledge and sees thereby a feather magnified and the whole image in distortion.");
		logger.info("We patronize them for their incompleteness, for their tragic fate of having taken form so far below ourselves.");
		logger.info("And therein we err, and greatly err.");
		logger.info("For the animal shall not be measured by man.");
		logger.info("In a world older and more complete than ours they moved finished and complete, gifted with extensions of the senses we have lost or never attained, living by voices we shall never hear.");
		logger.info("They are not brethren, they are not underlings; they are other nations, caught with ourselves in the net of life and time, fellow prisoners of the splendour and travail of the earth.");
	}
}
