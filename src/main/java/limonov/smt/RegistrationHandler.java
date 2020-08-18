package limonov.smt;

import limonov.smt.init.ModBlocks;
import limonov.smt.item.ItemMagnetiteArmor;
import limonov.smt.item.ItemMagnetiteAxe;
import limonov.smt.item.ItemMagnetiteHoe;
import limonov.smt.item.ItemMagnetitePickaxe;
import limonov.smt.item.ItemMagnetiteShovel;
import limonov.smt.item.ItemMagnetiteSword;
import limonov.smt.util.RegistryUtil;
import limonov.smt.materials.SMTMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistrationHandler {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "magnetite").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new Item(), "magnetite_ingot").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteAxe(SMTMaterials.MAGNETITE_TOOL, 8, -3.1F),  "magnetite_axe").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteHoe(SMTMaterials.MAGNETITE_TOOL), "magnetite_hoe").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetitePickaxe(SMTMaterials.MAGNETITE_TOOL), "magnetite_pickaxe").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteShovel(SMTMaterials.MAGNETITE_TOOL), "magnetite_shovel").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteSword(SMTMaterials.MAGNETITE_TOOL), "magnetite_sword").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteArmor(SMTMaterials.MAGNETITE_ARMOR, EntityEquipmentSlot.HEAD), "magnetite_helmet").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteArmor(SMTMaterials.MAGNETITE_ARMOR, EntityEquipmentSlot.CHEST), "magnetite_chestplate").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteArmor(SMTMaterials.MAGNETITE_ARMOR, EntityEquipmentSlot.LEGS), "magnetite_leggings").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setItemName(new ItemMagnetiteArmor(SMTMaterials.MAGNETITE_ARMOR, EntityEquipmentSlot.FEET), "magnetite_boots").setCreativeTab(TutorialMod.SMT_TAB),
		};
		
		final Item[] itemBlocks =  {
				new ItemBlock(ModBlocks.MAGNETITE_ORE).setRegistryName(ModBlocks.MAGNETITE_ORE.getRegistryName()),
				new ItemBlock(ModBlocks.MAGNETITE_BLOCK).setRegistryName(ModBlocks.MAGNETITE_BLOCK.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				RegistryUtil.setBlockName(new Block(Material.ROCK), "magnetite_ore").setCreativeTab(TutorialMod.SMT_TAB),
				RegistryUtil.setBlockName(new Block(Material.ROCK), "magnetite_block").setCreativeTab(TutorialMod.SMT_TAB)
		};
		
		event.getRegistry().registerAll(blocks);
	}
}
