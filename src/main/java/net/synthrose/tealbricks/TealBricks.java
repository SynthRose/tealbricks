package net.synthrose.tealbricks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.synthrose.tealbricks.block.TBBlocks;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TealBricks implements ModInitializer {
	public static Logger LOGGER = LogManager.getLogger();

	public static final String MOD_ID = "tealbricks";
	public static final String MOD_NAME = "Teal Bricks";

	@Override
	public void onInitialize() {
		TBBlocks.registerBlocks();
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	public static void log(Level level, String message) {
		LOGGER.log(level, "["+MOD_NAME+"] " + message);
	}
	
}
