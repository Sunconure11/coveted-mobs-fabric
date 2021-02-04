package net.sunconure11.covetedmobs.common.registry;

//R DZH SVIV
//HFMXLMFIV11
//HKRMLHZFIFH111
//MLGOVTZOGVMWVI
//OVHLERPP
//WZGFIZ
//GSILFTS GSVHV ORMVH R WL WVXIVV
//GSZG YB NVIVOB KFGGRMT NB MZNV RM
//NB RMUOFVMXV TILDH, ZMW GSFH, R YVXLNV RNNLIGZO
//XBYVIMVGRX DVY


//GL HLNV, R ZN YFG Z HSZWV
//YFG SVIV, R VCVIG KLDVI LEVI GSVN
//R NZWV Z XZHGOV SVIV LM GSRH SROO
//ZMW SZEV KFG NB UOZT RM GSV TILFMW
//GSRH RH NB MVD DLIOW


//HSLFOW GSV GIVHKZHHVIH LU GSV LOW DLIOW
//ZIIREV SVIV, YVZIRMT SLHGRORGRVH
//GSVB DROO YV NVG DRGS DIZGS

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sunconure11.covetedmobs.CovetedMobs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CMObjects {
	private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
	private static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

	public static final Item BLINDWORM_SPAWN_EGG = create("blindworm_spawn_egg", new SpawnEggItem(CMEntityTypes.BLINDWORM, 0x9F8170, 0xC3B091, gen()));

	private static <T extends Block> T create(String name, T block, boolean createItem) {
		BLOCKS.put(block, new Identifier(CovetedMobs.MODID, name));
		if (createItem) {
			ITEMS.put(new BlockItem(block, gen()), BLOCKS.get(block));
		}
		return block;
	}

	private static <T extends Item> T create(String name, T item) {
		ITEMS.put(item, new Identifier(CovetedMobs.MODID, name));
		return item;
	}

	private static Item.Settings gen() {
		return new Item.Settings().group(CovetedMobs.COVETED_MOBS_GROUP);
	}

	public static void init() {
		BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
		ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
	}
}
