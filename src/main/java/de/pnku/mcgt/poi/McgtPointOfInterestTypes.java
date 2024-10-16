package de.pnku.mcgt.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mcgt.init.McgtBlockInit;
import de.pnku.mcgt.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class McgtPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> cartographerEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .getHolder(PoiTypes.CARTOGRAPHER).get();

        PoiType cartographerPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.get(PoiTypes.CARTOGRAPHER);

        List<BlockState> cartographerBlockStates = new ArrayList<BlockState>(cartographerPoiType.matchingStates);

        for (Block block : McgtBlockInit.more_cartography_tables) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, cartographerEntry);
            }

            cartographerBlockStates.addAll(blockStates);
        }

        cartographerPoiType.matchingStates = ImmutableSet.copyOf(cartographerBlockStates);
    }
}