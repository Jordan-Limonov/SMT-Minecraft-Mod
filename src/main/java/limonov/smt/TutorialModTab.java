package limonov.smt;

import limonov.smt.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialModTab extends CreativeTabs {
	public TutorialModTab() {
		super(TutorialMod.MODID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItems.MAGNETITE);
	}
}
