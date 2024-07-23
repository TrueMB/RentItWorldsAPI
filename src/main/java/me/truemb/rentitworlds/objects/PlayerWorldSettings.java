package me.truemb.rentitworlds.objects;

import org.bukkit.Location;
import com.google.gson.JsonObject;

public class PlayerWorldSettings {
	
	public JsonObject getJson() {
		return null;
	}
	
	/**
	 * Get PlayerWorld Gadgets as a Json Object
	 * 
	 * @return JsonObject - Gadgets
	 */
	public JsonObject getGadgetsJson() {
		return this.getJson().getAsJsonObject("Gadgets");
	}

	/**
	 * Get PlayerWorld Settings as a Json Object
	 * 
	 * @return JsonObject - Settings
	 */
	public JsonObject getSettingsJson() {
		return this.getJson().getAsJsonObject("Settings");
	}
	
	/**
	 * Get Custom Spawn Location, if Player defined an own
	 * 
	 * @return Location - Custom Spawn Location - Otherwise Null
	 */
	public Location getSpawnLocation() {
		return null;
	}

}
