
package fr.strykerz.kelaxfaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.kelaxfaction.procedure.ProcedureAntesArmorBodyTickEvent;
import fr.strykerz.kelaxfaction.creativetab.TabArmorTab;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ItemAntesArmor extends ElementsKelaxfactionofficialMod.ModElement {
	@GameRegistry.ObjectHolder("kelaxfactionofficial:antes_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:antes_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:antes_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("kelaxfactionofficial:antes_armorboots")
	public static final Item boots = null;
	public ItemAntesArmor(ElementsKelaxfactionofficialMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ANTES_ARMOR", "kelaxfactionofficial:ant_", 27, new int[]{4, 7, 9, 4}, 20,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("antes_armorhelmet")
				.setRegistryName("antes_armorhelmet").setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAntesArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("antes_armorbody").setRegistryName("antes_armorbody").setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("antes_armorlegs")
				.setRegistryName("antes_armorlegs").setCreativeTab(TabArmorTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("antes_armorboots")
				.setRegistryName("antes_armorboots").setCreativeTab(TabArmorTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("kelaxfactionofficial:antes_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("kelaxfactionofficial:antes_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("kelaxfactionofficial:antes_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("kelaxfactionofficial:antes_armorboots", "inventory"));
	}
}
