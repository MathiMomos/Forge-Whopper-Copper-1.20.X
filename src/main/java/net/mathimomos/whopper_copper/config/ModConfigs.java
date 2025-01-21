package net.mathimomos.whopper_copper.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {
    public final ForgeConfigSpec.IntValue oxidationTime;
    public final ForgeConfigSpec.BooleanValue oxidationEnabled;

    public ModConfigs(final ForgeConfigSpec.Builder builder) {
        builder.push("whopper-copper-config");
        oxidationTime = builder
                .comment("Time in seconds for the next oxidation state")
                .defineInRange("oxidationTime", 600, 0, Integer.MAX_VALUE);

        oxidationEnabled = builder
                .comment("Is oxidation enabled?")
                        .define("oxidationEnabled", true);
        builder.pop();
    }
}
