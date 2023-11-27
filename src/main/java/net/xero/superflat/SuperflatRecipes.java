package net.xero.superflat;

import net.fabricmc.api.ModInitializer;

import net.xero.superflat.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperflatRecipes implements ModInitializer {
	public static final String MOD_ID = "superflatrecipes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
	}
}