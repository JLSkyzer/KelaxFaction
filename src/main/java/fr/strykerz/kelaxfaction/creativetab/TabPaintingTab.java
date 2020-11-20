
package fr.strykerz.kelaxfaction.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.strykerz.kelaxfaction.block.BlockPaintingIle;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class TabPaintingTab extends ElementsKelaxfactionofficialMod.ModElement {
	public TabPaintingTab(ElementsKelaxfactionofficialMod instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabpainting_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockPaintingIle.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
