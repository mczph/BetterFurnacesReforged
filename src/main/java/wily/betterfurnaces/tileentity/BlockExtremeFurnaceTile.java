package wily.betterfurnaces.tileentity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraftforge.common.ForgeConfigSpec;
import wily.betterfurnaces.Config;
import wily.betterfurnaces.container.BlockExtremeFurnaceContainer;
import wily.betterfurnaces.init.Registration;

public class BlockExtremeFurnaceTile extends BlockSmeltingTileBase {
    public BlockExtremeFurnaceTile() {
        super(Registration.EXTREME_FURNACE_TILE.get(), 6);
    }

    @Override
    public ForgeConfigSpec.IntValue getCookTimeConfig() {
        return Config.extremeTierSpeed;
    }

    @Override
    public Container IcreateMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new BlockExtremeFurnaceContainer(i, level, worldPosition, playerInventory, playerEntity, this.fields);
    }

}
