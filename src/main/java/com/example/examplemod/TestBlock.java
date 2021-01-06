package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class TestBlock extends Block {
	public static final String NAME = "test";
	private static final String UNLOCALIZED_NAME = "test_block";
	private static final String REGISTRY_NAME = "test_block_registry";
	
	public TestBlock() {
		super(Material.ROCK);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.setUnlocalizedName(UNLOCALIZED_NAME);
		this.setRegistryName(REGISTRY_NAME);
		
		//this.setHardness(1.5F);
		//this.setLightOpacity(0);
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return true;
	}
	
	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return true;
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}
}