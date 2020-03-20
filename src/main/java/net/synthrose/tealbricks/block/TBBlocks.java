package net.synthrose.tealbricks.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.util.registry.Registry;
import net.synthrose.tealbricks.TealBricks;

public class TBBlocks {
	
	public static final Block TEAL_NETHER_BRICKS = new Block(Settings.copy(Blocks.RED_NETHER_BRICKS));
	public static final Block TEAL_NETHER_BRICK_SLAB = new SlabBlock(Settings.copy(Blocks.RED_NETHER_BRICK_SLAB));
	public static final Block TEAL_NETHER_BRICK_STAIRS = new TBStairsBlock(TEAL_NETHER_BRICKS.getDefaultState(),
			Settings.copy(Blocks.RED_NETHER_BRICK_STAIRS));
	public static final Block TEAL_NETHER_BRICK_WALL = new WallBlock(Settings.copy(Blocks.RED_NETHER_BRICK_WALL));
	public static final Block LANTERN_BLOCK = new Block(Settings.copy(Blocks.GLOWSTONE));
	public static final Block SOUL_LANTERN_BLOCK = new Block(Settings.copy(Blocks.GLOWSTONE));

	public static void registerBlocks() {
		register("teal_nether_bricks", TEAL_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
		register("teal_nether_brick_slab", TEAL_NETHER_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
		register("teal_nether_brick_stairs", TEAL_NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
		register("teal_nether_brick_wall", TEAL_NETHER_BRICK_WALL, ItemGroup.DECORATIONS);
		register("lantern_block", LANTERN_BLOCK, ItemGroup.BUILDING_BLOCKS);
		register("soul_lantern_block", SOUL_LANTERN_BLOCK, ItemGroup.BUILDING_BLOCKS);
	}
	
	public static void register(String name, Block block, ItemGroup group) {
		Registry.register(Registry.BLOCK, TealBricks.id(name), block);
		Registry.register(Registry.ITEM, TealBricks.id(name), new BlockItem(block, itemDefaults(group)));
	}
	
	public static Item.Settings itemDefaults(ItemGroup group) {
		return new Item.Settings().group(group);
	}
	
}
