package limonov.smt.client;

import limonov.smt.TutorialMod;
import limonov.smt.init.ModBlocks;
import limonov.smt.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = TutorialMod.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.MAGNETITE, 0);
		registerModel(ModItems.MAGNETITE_INGOT, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.MAGNETITE_ORE), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.MAGNETITE_BLOCK), 0);
		registerModel(ModItems.MAGNETITE_AXE, 0);
		registerModel(ModItems.MAGNETITE_HOE, 0);
		registerModel(ModItems.MAGNETITE_PICKAXE, 0);
		registerModel(ModItems.MAGNETITE_SHOVEL, 0);
		registerModel(ModItems.MAGNETITE_SWORD, 0);
		registerModel(ModItems.MAGNETITE_HELMET, 0);
		registerModel(ModItems.MAGNETITE_CHESTPLATE, 0);
		registerModel(ModItems.MAGNETITE_LEGGINGS, 0);
		registerModel(ModItems.MAGNETITE_BOOTS, 0);
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item,  meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
