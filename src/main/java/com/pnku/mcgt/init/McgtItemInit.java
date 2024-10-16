package com.pnku.mcgt.init;

import com.pnku.mcgt.MoreCartographyTables;
import com.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;

public class McgtItemInit {
    public static final BlockItem OAK_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.OAK_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem SPRUCE_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.SPRUCE_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem BIRCH_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.BIRCH_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem JUNGLE_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.JUNGLE_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem ACACIA_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.ACACIA_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem MANGROVE_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.MANGROVE_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem CHERRY_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.CHERRY_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem BAMBOO_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.BAMBOO_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem CRIMSON_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.CRIMSON_CARTOGRAPHY_TABLE, new Item.Properties());
    public static final BlockItem WARPED_CARTOGRAPHY_TABLE_I = new BlockItem(McgtBlockInit.WARPED_CARTOGRAPHY_TABLE, new Item.Properties());


    public static void registerItems() {
        registerItem(OAK_CARTOGRAPHY_TABLE_I, Items.CARTOGRAPHY_TABLE);
        registerItem(SPRUCE_CARTOGRAPHY_TABLE_I, OAK_CARTOGRAPHY_TABLE_I);
        registerItem(BIRCH_CARTOGRAPHY_TABLE_I, SPRUCE_CARTOGRAPHY_TABLE_I);
        registerItem(JUNGLE_CARTOGRAPHY_TABLE_I, BIRCH_CARTOGRAPHY_TABLE_I);
        registerItem(ACACIA_CARTOGRAPHY_TABLE_I, JUNGLE_CARTOGRAPHY_TABLE_I);
        registerItem(MANGROVE_CARTOGRAPHY_TABLE_I, ACACIA_CARTOGRAPHY_TABLE_I);
        registerItem(CHERRY_CARTOGRAPHY_TABLE_I, MANGROVE_CARTOGRAPHY_TABLE_I);
        registerItem(BAMBOO_CARTOGRAPHY_TABLE_I, CHERRY_CARTOGRAPHY_TABLE_I);
        registerItem(CRIMSON_CARTOGRAPHY_TABLE_I, BAMBOO_CARTOGRAPHY_TABLE_I);
        registerItem(WARPED_CARTOGRAPHY_TABLE_I, CRIMSON_CARTOGRAPHY_TABLE_I);
    }

    private static void registerItem(BlockItem cartographyTable, Item cartographyTableAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreCartographyTables.asId(((MoreCartographyTablesBlock) cartographyTable.getBlock()).cartographytableType + "_cartography_table"), cartographyTable);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(cartographyTableAfter, cartographyTable));
    }
}