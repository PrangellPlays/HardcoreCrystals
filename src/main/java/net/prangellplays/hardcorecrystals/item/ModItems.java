package net.prangellplays.hardcorecrystals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.hardcorecrystals.HardcoreCrystals;
import net.prangellplays.hardcorecrystals.item.custom.*;
import net.prangellplays.hardcorecrystals.item.custom.lvl1.*;

public class ModItems {

    public static final Item BASE_CRYSTAL = registerItem("base_crystal",
            new BaseCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item FIRE_CRYSTAL = registerItem("fire_crystal",
            new FireCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item ASTRAL_CRYSTAL = registerItem("astral_crystal",
            new AstralCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item LIFE_CRYSTAL = registerItem("life_crystal",
            new LifeCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item PUFF_CRYSTAL = registerItem("puff_crystal",
            new PuffCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item SPEED_CRYSTAL = registerItem("speed_crystal",
            new SpeedCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item STRENGTH_CRYSTAL = registerItem("strength_crystal",
            new StrengthCrystal(new FabricItemSettings().maxCount(1)));

    public static final Item WEALTH_CRYSTAL = registerItem("wealth_crystal",
            new WealthCrystal(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HardcoreCrystals.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.COMBAT, BASE_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, FIRE_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, ASTRAL_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, LIFE_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, PUFF_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, SPEED_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, STRENGTH_CRYSTAL);
        addToItemGroup(ItemGroups.COMBAT, WEALTH_CRYSTAL);

        addToItemGroup(ModItemGroup.CRYSTALS, BASE_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, FIRE_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, ASTRAL_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, LIFE_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, PUFF_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, SPEED_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, STRENGTH_CRYSTAL);
        addToItemGroup(ModItemGroup.CRYSTALS, WEALTH_CRYSTAL);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        HardcoreCrystals.LOGGER.info("Registering Mod Items for " + HardcoreCrystals.MOD_ID);

        addItemsToItemGroup();
    }
}
