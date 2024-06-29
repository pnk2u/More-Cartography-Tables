package com.pnku.mcgt.init;

import com.pnku.mcgt.MoreCartographyTables;
import com.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class McgtBlockInit {
    public static final MoreCartographyTablesBlock OAK_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.OAK_TAN, "oak");
    public static final MoreCartographyTablesBlock SPRUCE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.SPRUCE_BROWN, "spruce");
    public static final MoreCartographyTablesBlock BIRCH_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.PALE_YELLOW, "birch");
    public static final MoreCartographyTablesBlock JUNGLE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.DIRT_BROWN, "jungle");
    public static final MoreCartographyTablesBlock ACACIA_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.ORANGE, "acacia");
    public static final MoreCartographyTablesBlock MANGROVE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.RED, "mangrove");
    public static final MoreCartographyTablesBlock CHERRY_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.CHERRY_WOOD, "cherry");
    public static final MoreCartographyTablesBlock BAMBOO_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD, "bamboo");
    public static final MoreCartographyTablesBlock CRIMSON_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.DULL_PINK, BlockSoundGroup.NETHER_WOOD, "crimson");
    public static final MoreCartographyTablesBlock WARPED_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.DARK_AQUA, BlockSoundGroup.NETHER_WOOD, "warped");

    public static final List<Block> more_cartography_tables = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_CARTOGRAPHY_TABLE);
        registerBlock(SPRUCE_CARTOGRAPHY_TABLE);
        registerBlock(BIRCH_CARTOGRAPHY_TABLE);
        registerBlock(JUNGLE_CARTOGRAPHY_TABLE);
        registerBlock(ACACIA_CARTOGRAPHY_TABLE);
        registerBlock(MANGROVE_CARTOGRAPHY_TABLE);
        registerBlock(CHERRY_CARTOGRAPHY_TABLE);
        registerBlock(BAMBOO_CARTOGRAPHY_TABLE);
        registerBlock(CRIMSON_CARTOGRAPHY_TABLE);
        registerBlock(WARPED_CARTOGRAPHY_TABLE);

    }

    private static void registerBlock(MoreCartographyTablesBlock cartography_table) {
        Registry.register(Registries.BLOCK, MoreCartographyTables.asId(cartography_table.cartographytableType + "_cartography_table"), cartography_table);
        more_cartography_tables.add(cartography_table);
    }
}