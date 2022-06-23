package wily.ultimatefurnaces.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import wily.betterfurnaces.container.BlockFurnaceContainerBase;
import wily.ultimatefurnaces.init.RegistrationUF;

public class BlockSteelFurnaceContainer extends BlockFurnaceContainerBase {

    public BlockSteelFurnaceContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player) {
        super(RegistrationUF.STEEL_FURNACE_CONTAINER.get(), windowId, world, pos, playerInventory, player);
    }

    public BlockSteelFurnaceContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player, IIntArray fields) {
        super(RegistrationUF.STEEL_FURNACE_CONTAINER.get(), windowId, world, pos, playerInventory, player, fields);
    }


    @Override
    public boolean stillValid(PlayerEntity playerIn) {
        return stillValid(IWorldPosCallable.create(te.getLevel(), te.getBlockPos()), playerEntity, RegistrationUF.STEEL_FURNACE.get());
    }
}
