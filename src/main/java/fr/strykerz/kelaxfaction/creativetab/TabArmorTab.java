
package fr.strykerz.kelaxfaction.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.strykerz.kelaxfaction.item.ItemAtenia;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class TabArmorTab extends ElementsKelaxfactionofficialMod.ModElement {
	public TabArmorTab(ElementsKelaxfactionofficialMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabarmor_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAtenia.body, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
