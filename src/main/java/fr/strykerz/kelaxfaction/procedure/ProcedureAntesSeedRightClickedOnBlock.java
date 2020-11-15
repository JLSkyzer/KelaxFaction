package fr.strykerz.kelaxfaction.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.kelaxfaction.item.ItemAntesSeed;
import fr.strykerz.kelaxfaction.block.BlockAntesFlowerStage1;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedureAntesSeedRightClickedOnBlock extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedureAntesSeedRightClickedOnBlock(ElementsKelaxfactionofficialMod instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AntesSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AntesSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AntesSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AntesSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AntesSeedRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRASS.getDefaultState().getBlock())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAntesFlowerStage1.block.getDefaultState(), 3);
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAntesSeed.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIRT.getStateFromMeta(0).getBlock())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAntesFlowerStage1.block.getDefaultState(), 3);
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAntesSeed.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAntesFlowerStage1.block.getDefaultState(), 3);
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAntesSeed.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
	}
}
