package de.pnku.mcgt.block;

import de.pnku.mcgt.MoreCartographyTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CartographyTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreCartographyTablesBlock extends CartographyTableBlock {
    public final String cartographytableType;

    public MoreCartographyTablesBlock(MapColor colour, String cartographytableType) {
        super(Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreCartographyTables.asId(cartographytableType + "_cartography_table"))));
        this.cartographytableType = cartographytableType;
    }

    public MoreCartographyTablesBlock(MapColor colour, SoundType soundType, String cartographytableType) {
        super(Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreCartographyTables.asId(cartographytableType + "_cartography_table"))).sound(soundType));
        this.cartographytableType = cartographytableType;
    }
}