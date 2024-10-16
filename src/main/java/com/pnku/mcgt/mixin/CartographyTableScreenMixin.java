package com.pnku.mcgt.mixin;

import com.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CartographyTableMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CartographyTableMenu.class)
public abstract class CartographyTableScreenMixin {

    @Shadow
    @Final
    private ContainerLevelAccess access;

    @Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
    private void canUse(Player player, CallbackInfoReturnable<Boolean> info) {
        if (this.access.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof MoreCartographyTablesBlock, true)) {
            info.setReturnValue(true);
        }
    }
}