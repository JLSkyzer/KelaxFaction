package fr.strykerz.kelaxfaction.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.kelaxfaction.item.ItemAteniaUpgradeSword;
import fr.strykerz.kelaxfaction.item.ItemAteniaSword;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ProcedureAteniaSwordToolInInventoryTick extends ElementsKelaxfactionofficialMod.ModElement {
	public ProcedureAteniaSwordToolInInventoryTick(ElementsKelaxfactionofficialMod instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AteniaSwordToolInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure AteniaSwordToolInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((((itemstack).getDisplayName())).equals("strykerzLeBg"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAteniaSword.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemAteniaUpgradeSword.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
