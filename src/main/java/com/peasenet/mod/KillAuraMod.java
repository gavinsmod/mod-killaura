package com.peasenet.mod;

import com.peasenet.main.GavinsMod;
import com.peasenet.mods.combat.ModKillAura;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KillAuraMod implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("gavinsmod");

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModKillAura());
    }
}
