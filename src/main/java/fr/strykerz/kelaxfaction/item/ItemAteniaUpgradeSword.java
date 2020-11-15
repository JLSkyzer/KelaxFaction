
package fr.strykerz.kelaxfaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import fr.strykerz.kelaxfaction.procedure.ProcedureAteniaUpgradeSwordLivingEntityIsHitWithTool;
import fr.strykerz.kelaxfaction.creativetab.TabToolTab;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

import com.google.common.collect.Multimap;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class ItemAteniaUpgradeSword extends ElementsKelaxfactionofficialMod.ModElement {
	@GameRegistry.ObjectHolder("kelaxfactionofficial:atenia_upgrade_sword")
	public static final Item block = null;
	public ItemAteniaUpgradeSword(ElementsKelaxfactionofficialMod instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("ATENIA_UPGRADE_SWORD", 4, 1800, 10f, 5f, 20)) {
			@Override
			public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
				Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
				if (slot == EntityEquipmentSlot.MAINHAND) {
					multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
							new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) this.getAttackDamage(), 0));
					multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
							new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.7999999999999998, 0));
				}
				return multimap;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 4);
				return ret.keySet();
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase entity2) {
				super.hitEntity(itemstack, entity, entity2);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAteniaUpgradeSwordLivingEntityIsHitWithTool.executeProcedure($_dependencies);
				}
				return true;
			}
		}.setUnlocalizedName("atenia_upgrade_sword").setRegistryName("atenia_upgrade_sword").setCreativeTab(TabToolTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kelaxfactionofficial:atenia_upgrade_sword", "inventory"));
	}
}
