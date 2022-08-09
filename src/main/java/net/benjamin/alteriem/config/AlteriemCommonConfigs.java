package net.benjamin.alteriem.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class AlteriemCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> STEEL_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> STEEL_ORE_VEINS_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> RUBY_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> RUBY_ORE_VEINS_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> ZINC_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> ZINC_ORE_VEINS_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> WYVNITE_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> WYVNITE_ORE_VEINS_PER_CHUNK;


    static {
        BUILDER.push("Steel Ore Configs");

        STEEL_ORE_VEIN_SIZE = BUILDER.comment("How many Steel Ore Blocks spawn in one Vein!")
                .defineInRange("Steel Ore Vein Size",4, 2, 26);
        STEEL_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Steel Ore Veins spawn per chunk!")
                .define("Steel Ore Veins Per Chunk", 4);

        BUILDER.pop();
        BUILDER.push("Ruby Ore Configs");

        RUBY_ORE_VEIN_SIZE = BUILDER.comment("How many Ruby Ore Blocks spawn in one Vein!")
                .defineInRange("Ruby Ore Vein Size",4, 3, 20);
        RUBY_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Ruby Ore Veins spawn per chunk!")
                .define("Ruby Ore Veins Per Chunk", 3);

        BUILDER.pop();
        BUILDER.push("Zinc Ore Configs");

        ZINC_ORE_VEIN_SIZE = BUILDER.comment("How many Zinc Ore Blocks spawn in one Vein!")
                .defineInRange("Zinc Ore Vein Size",5, 1, 20);
        ZINC_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Zinc Ore Veins spawn per chunk!")
                .define("Zinc Ore Veins Per Chunk", 3);

        BUILDER.pop();
        BUILDER.push("Wyvnite Ore Configs");

        WYVNITE_ORE_VEIN_SIZE = BUILDER.comment("How many Wyvnite Ore Blocks spawn in one Vein!")
                .defineInRange("Wyvnite Ore Vein Size",3, 1, 20);
        WYVNITE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Wyvnite Ore Veins spawn per chunk!")
                .define("Wyvnite Ore Veins Per Chunk", 3);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
