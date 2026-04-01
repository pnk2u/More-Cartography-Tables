package de.pnku.mcgt;

import de.pnku.mcgt.init.McgtBlockInit;
import de.pnku.mcgt.init.McgtItemInit;
import de.pnku.mcgt.poi.McgtPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class MoreCartographyTables implements ModInitializer {
    public static final String MODID = "lolmcgt";

    @Override
    public void onInitialize() {
        McgtBlockInit.registerBlocks();
        McgtItemInit.registerItems();
        McgtPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}