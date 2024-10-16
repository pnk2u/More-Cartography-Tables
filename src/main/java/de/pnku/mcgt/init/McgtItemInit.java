package de.pnku.mcgt.init;

import de.pnku.mcgt.MoreCartographyTables;
import de.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import static de.pnku.mcgt.init.McgtBlockInit.*;

public class McgtItemInit {
    public static final BlockItem OAK_CARTOGRAPHY_TABLE_I = itemFromBlock(OAK_CARTOGRAPHY_TABLE);
    public static final BlockItem SPRUCE_CARTOGRAPHY_TABLE_I = itemFromBlock(SPRUCE_CARTOGRAPHY_TABLE);
    public static final BlockItem BIRCH_CARTOGRAPHY_TABLE_I = itemFromBlock(BIRCH_CARTOGRAPHY_TABLE);
    public static final BlockItem JUNGLE_CARTOGRAPHY_TABLE_I = itemFromBlock(JUNGLE_CARTOGRAPHY_TABLE);
    public static final BlockItem ACACIA_CARTOGRAPHY_TABLE_I = itemFromBlock(ACACIA_CARTOGRAPHY_TABLE);
    public static final BlockItem MANGROVE_CARTOGRAPHY_TABLE_I = itemFromBlock(MANGROVE_CARTOGRAPHY_TABLE);
    public static final BlockItem CHERRY_CARTOGRAPHY_TABLE_I = itemFromBlock(CHERRY_CARTOGRAPHY_TABLE);
    public static final BlockItem BAMBOO_CARTOGRAPHY_TABLE_I = itemFromBlock(BAMBOO_CARTOGRAPHY_TABLE);
    public static final BlockItem CRIMSON_CARTOGRAPHY_TABLE_I = itemFromBlock(CRIMSON_CARTOGRAPHY_TABLE);
    public static final BlockItem WARPED_CARTOGRAPHY_TABLE_I = itemFromBlock(WARPED_CARTOGRAPHY_TABLE);

    public static BlockItem itemFromBlock(MoreCartographyTablesBlock moreCartographyTableBlock) {
        return new BlockItem(moreCartographyTableBlock, setProperties(moreCartographyTableBlock));
    }

    public static Item.Properties setProperties(MoreCartographyTablesBlock moreCartographyTableBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreCartographyTableBlock))).useBlockDescriptionPrefix();
    }

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