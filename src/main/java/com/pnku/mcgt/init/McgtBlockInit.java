package com.pnku.mcgt.init;

import com.pnku.mcgt.MoreCartographyTables;
import com.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class McgtBlockInit {
    public static final MoreCartographyTablesBlock OAK_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.WOOD, "oak");
    public static final MoreCartographyTablesBlock SPRUCE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.PODZOL, "spruce");
    public static final MoreCartographyTablesBlock BIRCH_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.SAND, "birch");
    public static final MoreCartographyTablesBlock JUNGLE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.DIRT, "jungle");
    public static final MoreCartographyTablesBlock ACACIA_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreCartographyTablesBlock MANGROVE_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreCartographyTablesBlock CHERRY_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreCartographyTablesBlock BAMBOO_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreCartographyTablesBlock CRIMSON_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreCartographyTablesBlock WARPED_CARTOGRAPHY_TABLE = new MoreCartographyTablesBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

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
        Registry.register(BuiltInRegistries.BLOCK, MoreCartographyTables.asId(cartography_table.cartographytableType + "_cartography_table"), cartography_table);
        more_cartography_tables.add(cartography_table);
    }
}