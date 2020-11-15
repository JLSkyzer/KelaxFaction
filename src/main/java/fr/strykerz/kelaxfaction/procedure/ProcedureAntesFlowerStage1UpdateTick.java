package fr.strykerz.kelaxfaction.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import fr.strykerz.kelaxfaction.block.BlockAntesFlowerStage2;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedureAntesFlowerStage1UpdateTick extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedureAntesFlowerStage1UpdateTick(ElementsKelaxfactionofficialMod instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AntesFlowerStage1UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AntesFlowerStage1UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AntesFlowerStage1UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AntesFlowerStage1UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAntesFlowerStage2.block.getDefaultState(), 3);
	}
}
