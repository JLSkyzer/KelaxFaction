
package fr.strykerz.kelaxfaction.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.Block;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.kelaxfaction.procedure.ProcedureAntesPlantStage5PlantDestroyedByPlayer;
import fr.strykerz.kelaxfaction.item.ItemAntesSeed;
import fr.strykerz.kelaxfaction.ElementsKelaxfactionofficialMod;

@ElementsKelaxfactionofficialMod.ModElement.Tag
public class BlockAntesPlantStage5 extends ElementsKelaxfactionofficialMod.ModElement {
	@GameRegistry.ObjectHolder("kelaxfactionofficial:antes_plant_stage_5")
	public static final Block block = null;
	public BlockAntesPlantStage5(ElementsKelaxfactionofficialMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("kelaxfactionofficial:antes_plant_stage_5", "inventory"));
	}
	public static class BlockCustomFlower extends BlockFlower {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(null);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setUnlocalizedName("antes_plant_stage_5");
			setRegistryName("antes_plant_stage_5");
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemAntesSeed.block, (int) (1)));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemAntesSeed.block, (int) (1));
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		@Override
		public BlockFlower.EnumFlowerColor getBlockType() {
			return BlockFlower.EnumFlowerColor.YELLOW;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void getSubBlocks(CreativeTabs tab, net.minecraft.util.NonNullList<ItemStack> list) {
			for (BlockFlower.EnumFlowerType blockflower$enumflowertype : BlockFlower.EnumFlowerType.getTypes(this.getBlockType())) {
				list.add(new ItemStack(this, 1, blockflower$enumflowertype.getMeta()));
			}
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureAntesPlantStage5PlantDestroyedByPlayer.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public void onBlockDestroyedByExplosion(World world, BlockPos pos, Explosion e) {
			super.onBlockDestroyedByExplosion(world, pos, e);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureAntesPlantStage5PlantDestroyedByPlayer.executeProcedure($_dependencies);
			}
		}
	}
}
