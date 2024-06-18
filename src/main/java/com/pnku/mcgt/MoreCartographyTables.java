package com.pnku.mcgt;

import com.pnku.mcgt.init.McgtBlockInit;
import com.pnku.mcgt.init.McgtItemInit;
import com.pnku.mcgt.poi.McgtPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class MoreCartographyTables implements ModInitializer {
    public static final String MODID = "lolmcgt";

    @Override
    public void onInitialize() {
        McgtBlockInit.registerBlocks();
        McgtItemInit.registerItems();
        McgtPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return Identifier.of(MODID, path);
    }
}