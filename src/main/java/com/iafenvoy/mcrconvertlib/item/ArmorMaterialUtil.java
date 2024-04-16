package com.iafenvoy.mcrconvertlib.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ArmorMaterialUtil {
    public static ArmorMaterial of(String name, int[] baseDurability, int durabilityMul, int[] protection, int enchantAbility, SoundEvent equipSound, float toughness, float knockBackResistance, ItemConvertible... repairIngredients) {
        return of(name, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.HELMET, baseDurability[0]);
            map.put(ArmorItem.Type.CHESTPLATE, baseDurability[1]);
            map.put(ArmorItem.Type.LEGGINGS, baseDurability[2]);
            map.put(ArmorItem.Type.BOOTS, baseDurability[3]);
        }), durabilityMul, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.HELMET, protection[0]);
            map.put(ArmorItem.Type.CHESTPLATE, protection[1]);
            map.put(ArmorItem.Type.LEGGINGS, protection[2]);
            map.put(ArmorItem.Type.BOOTS, protection[3]);
        }), enchantAbility, equipSound, toughness, knockBackResistance, repairIngredients);
    }

    public static ArmorMaterial of(String name, EnumMap<ArmorItem.Type, Integer> baseDurability, int durabilityMul, EnumMap<ArmorItem.Type, Integer> protection, int enchantAbility, SoundEvent equipSound, float toughness, float knockBackResistance, ItemConvertible... repairIngredients) {
        return new ArmorMaterial() {
            @Override
            public int getDurability(ArmorItem.Type slot) {
                return baseDurability.get(slot) * durabilityMul;
            }

            @Override
            public int getProtection(ArmorItem.Type slot) {
                return protection.get(slot);
            }

            @Override
            public int getEnchantability() {
                return enchantAbility;
            }

            @Override
            public SoundEvent getEquipSound() {
                return equipSound;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(repairIngredients);
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public float getToughness() {
                return toughness;
            }

            @Override
            public float getKnockbackResistance() {
                return knockBackResistance;
            }
        };
    }
}
