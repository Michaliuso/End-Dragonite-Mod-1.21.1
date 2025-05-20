package com.michaliu.enddragonite;

import net.fabricmc.api.ModInitializer;

import com.michaliu.enddragonite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class EndDragoniteMod implements ModInitializer {
	public static final String MOD_ID = "EndDragonite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}