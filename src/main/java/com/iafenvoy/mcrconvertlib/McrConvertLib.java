package com.iafenvoy.mcrconvertlib;

import com.iafenvoy.mcrconvertlib.misc.Timeout;
import net.fabricmc.api.ModInitializer;

public class McrConvertLib implements ModInitializer {
    @Override
    public void onInitialize() {
        Timeout.startTimeout();
    }
}
