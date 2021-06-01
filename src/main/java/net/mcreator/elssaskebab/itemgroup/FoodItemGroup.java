
package net.mcreator.elssaskebab.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elssaskebab.item.KebabItem;
import net.mcreator.elssaskebab.ElssasKebabModElements;

@ElssasKebabModElements.ModElement.Tag
public class FoodItemGroup extends ElssasKebabModElements.ModElement {
	public FoodItemGroup(ElssasKebabModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KebabItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
