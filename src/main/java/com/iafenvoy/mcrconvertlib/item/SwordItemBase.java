package com.iafenvoy.mcrconvertlib.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class SwordItemBase extends SwordItem {
    public SwordItemBase(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean onSwingHand(ItemStack itemtack, World world, double x, double y, double z) {
        return false;
    }
}
