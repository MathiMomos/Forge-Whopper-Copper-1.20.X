package net.mathimomos.whopper_copper.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigs {
    public static final ForgeConfigSpec COMMON_CONFIG;
    public static final ForgeConfigSpec.IntValue OXIDATION_TIME;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("Wormhole Artifact Config");
        OXIDATION_TIME = builder
                .comment("Time in minutes for next oxidation state")
                .defineInRange("WormholeArtifactCooldown", 20, 0, Integer.MAX_VALUE);
        builder.pop();

        COMMON_CONFIG = builder.build();
    }

    public static void register() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG);
    }
}
