
package fr.strykerz.kelaxfaction.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import fr.strykerz.kelaxfaction.item.ItemAteniaIngot;
import fr.strykerz.kelaxfaction.block.BlockAteniaOre;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class RecipeSmeltAteniaOre extends ElementsKelaxfactionofficialMod.ModElement {
	public RecipeSmeltAteniaOre(ElementsKelaxfactionofficialMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAteniaOre.block, (int) (1)), new ItemStack(ItemAteniaIngot.block, (int) (1)), 1F);
	}
}
