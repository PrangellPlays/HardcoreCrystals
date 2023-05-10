package net.prangellplays.hardcorecrystals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.prangellplays.hardcorecrystals.HardcoreCrystals;

public class ModItemGroup {
    public static ItemGroup CRYSTALS;

    public static void registerItemGroups() {
        CRYSTALS = FabricItemGroup.builder(new Identifier(HardcoreCrystals.MOD_ID, "crystals"))
                .displayName(Text.translatable("itemgroup.crystals"))
                .icon(() -> new ItemStack(ModItems.BASE_CRYSTAL)).build();
    }
}
