package fr.strykerz.kelaxfaction.procedure;

import net.minecraft.world.World;

import java.util.Map;

import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedurePillageGunBulletHitsBlock extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedurePillageGunBulletHitsBlock(ElementsKelaxfactionofficialMod instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PillageGunBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PillageGunBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PillageGunBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PillageGunBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 1, true);
		}
	}
}
