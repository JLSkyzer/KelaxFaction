package fr.strykerz.kelaxfaction.procedure;

import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedureAteniaUpgradeSwordLivingEntityIsHitWithTool extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedureAteniaUpgradeSwordLivingEntityIsHitWithTool(ElementsKelaxfactionofficialMod instance) {
		super(instance, 44);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AteniaUpgradeSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 2);
	}
}
