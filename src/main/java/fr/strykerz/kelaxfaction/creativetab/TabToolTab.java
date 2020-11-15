
package fr.strykerz.kelaxfaction.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.strykerz.kelaxfaction.item.ItemAteniaSword;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class TabToolTab extends ElementsKelaxfactionofficialMod.ModElement {
	public TabToolTab(ElementsKelaxfactionofficialMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtool_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAteniaSword.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
