package fr.strykerz.kelaxfaction.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import fr.strykerz.kelaxfaction.block.BlockAntesPlantStage5;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedureAntesFlowerStage4UpdateTick extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedureAntesFlowerStage4UpdateTick(ElementsKelaxfactionofficialMod instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AntesFlowerStage4UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AntesFlowerStage4UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AntesFlowerStage4UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AntesFlowerStage4UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAntesPlantStage5.block.getDefaultState(), 3);
	}
}
