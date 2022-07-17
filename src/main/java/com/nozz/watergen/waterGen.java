package com.nozz.watergen;

import net.minecraft.client.gui.screens.worldselection.WorldPreset;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("waterGen")
public class waterGen {
    public waterGen() {
        MinecraftForge.EVENT_BUS.register(this);
        WorldGenerationContext worldGenerationContext = new WorldGenerationContext();
    }

}
