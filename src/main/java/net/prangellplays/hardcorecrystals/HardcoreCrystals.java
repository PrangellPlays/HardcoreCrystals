package net.prangellplays.hardcorecrystals;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.hardcorecrystals.item.ModItemGroup;
import net.prangellplays.hardcorecrystals.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardcoreCrystals implements ModInitializer {
	public static final String MOD_ID = "hardcorecrystals";
	public static final Logger LOGGER = LoggerFactory.getLogger("hardcorecrystals");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
