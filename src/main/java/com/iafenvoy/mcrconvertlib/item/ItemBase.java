package com.iafenvoy.mcrconvertlib.item;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ItemBase extends Item {
    public ItemBase(Function<Settings, Settings> properties) {
        super(properties.apply(new Settings().rarity(Rarity.COMMON).maxCount(64)));
    }
}
