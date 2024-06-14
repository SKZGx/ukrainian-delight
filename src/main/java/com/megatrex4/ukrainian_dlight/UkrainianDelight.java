package com.megatrex4.ukrainian_dlight;

import com.megatrex4.ukrainian_dlight.block.ModBlocks;
import com.megatrex4.ukrainian_dlight.item.JarsItems;
import com.megatrex4.ukrainian_dlight.item.ModItemGroups;
import com.megatrex4.ukrainian_dlight.item.ModItems;
import com.megatrex4.ukrainian_dlight.item.ToolTipHelper;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UkrainianDelight implements ModInitializer {
	public static final String MOD_ID = "ukrainian_delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		JarsItems.registerJarsItems();
		ModItemGroups.registerItemGroups();
		ToolTipHelper.registerTooltip();



		LOGGER.info("Hello Fabric world it's " + MOD_ID + "!");
	}
}