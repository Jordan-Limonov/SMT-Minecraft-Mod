package limonov.smt;

import limonov.smt.util.RegistryUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistrationHandler {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(CreativeTabs.MISC),
				RegistryUtil.setItemName(new Item(), "magnetite").setCreativeTab(CreativeTabs.MISC)
		};
		
		event.getRegistry().registerAll(items);
	}
}
