package de.pnku.mcgt.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import de.pnku.mcgt.block.MoreCartographyTablesBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CartographyTableMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CartographyTableMenu.class)
public abstract class CartographyTableMenuMixin {

    @WrapOperation(method = "stillValid", at = @At(value="INVOKE", target="Lnet/minecraft/world/inventory/CartographyTableMenu;stillValid(Lnet/minecraft/world/inventory/ContainerLevelAccess;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean wrappedStillValid(ContainerLevelAccess containerLevelAccess, Player player, Block block, Operation<Boolean> original) {
        if (containerLevelAccess.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof MoreCartographyTablesBlock, true)) {
            return true;
        }
        return original.call(containerLevelAccess, player, block);
    }
}