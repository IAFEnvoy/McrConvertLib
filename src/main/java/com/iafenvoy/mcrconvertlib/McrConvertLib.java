package com.iafenvoy.mcrconvertlib;

import com.iafenvoy.mcrconvertlib.misc.Timeout;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class McrConvertLib implements ModInitializer {
    public static final GameRules.Key<GameRules.BooleanRule> showModLightening = GameRuleRegistry.register("showModLightening", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));

    @Override
    public void onInitialize() {
        Timeout.startTimeout();
    }
}
