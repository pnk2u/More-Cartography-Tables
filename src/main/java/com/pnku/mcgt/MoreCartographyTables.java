package com.pnku.mcgt;

import com.pnku.mcgt.init.McgtBlockInit;
import com.pnku.mcgt.init.McgtItemInit;
import com.pnku.mcgt.poi.McgtPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreCartographyTables implements ModInitializer {
    public static final String MODID = "lolmcgt";

    @Override
    public void onInitialize() {
        McgtBlockInit.registerBlocks();
        McgtItemInit.registerItems();
        McgtPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}