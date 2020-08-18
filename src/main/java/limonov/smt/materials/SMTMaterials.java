package limonov.smt.materials;

import limonov.smt.TutorialMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SMTMaterials {

	public static final ToolMaterial MAGNETITE_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "magnetite_tool", 2, 200, 8, 2, 22);
	public static final ArmorMaterial MAGNETITE_ARMOR = EnumHelper.addArmorMaterial(TutorialMod.MODID + ":" + "magnetite_armor", TutorialMod.MODID + ":magnetite", 10, new int[] {2, 5, 4, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	
}
