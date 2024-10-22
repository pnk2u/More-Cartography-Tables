package de.pnku.mcgt.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CartographyTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreCartographyTablesBlock extends CartographyTableBlock {
    public final String cartographytableType;

    public MoreCartographyTablesBlock(MapColor colour, String cartographytableType) {
        super(Properties.copy(Blocks.CARTOGRAPHY_TABLE).mapColor(colour));
        this.cartographytableType = cartographytableType;
    }

    public MoreCartographyTablesBlock(MapColor colour, SoundType soundType, String cartographytableType) {
        super(Properties.copy(Blocks.CARTOGRAPHY_TABLE).mapColor(colour).sound(soundType));
        this.cartographytableType = cartographytableType;
    }
}