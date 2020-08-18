package limonov.smt;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, name = TutorialMod.NAME, 
	 version = TutorialMod.VERSION, 
	 acceptedMinecraftVersions = TutorialMod.MC_VERSION)
public class TutorialMod {
	public static final String MODID = "shin-megami-tensei";
	public static final String NAME = "Shin Megami Tensei";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final CreativeTabs SMT_TAB = new TutorialModTab();
	
	public static final Logger LOGGER = LogManager.getLogger(TutorialMod.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(TutorialMod.NAME + " says hi!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
