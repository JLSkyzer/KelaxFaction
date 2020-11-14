
package fr.strykerz.kelaxfaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import fr.strykerz.kelaxfaction.creativetab.TabArmorTab;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ItemAtenia extends ElementsKelaxfactionofficialMod.ModElement {
	@GameRegistry.ObjectHolder("kelaxfactionofficial:ateniahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:ateniabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:atenialegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:ateniaboots")
	public static final Item boots = null;
	public ItemAtenia(ElementsKelaxfactionofficialMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ATENIA", "kelaxfactionofficial:atenia_armor", 28, new int[]{4, 7, 9, 4}, 20,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ateniahelmet").setRegistryName("ateniahelmet")
				.setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ateniabody").setRegistryName("ateniabody")
				.setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("atenialegs").setRegistryName("atenialegs")
				.setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ateniaboots").setRegistryName("ateniaboots")
				.setCreativeTab(TabArmorTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("kelaxfactionofficial:ateniahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("kelaxfactionofficial:ateniabody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("kelaxfactionofficial:atenialegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("kelaxfactionofficial:ateniaboots", "inventory"));
	}
}
