package me.truemb.rentitworlds.objects;

import java.util.UUID;

import me.truemb.rentitworlds.enums.Gadget;

public class PlayerData {

	public String getUsername() {
		return null;
	}

	public UUID getUUID() {
		return null;
	}
	
	/**
	 * Is Player owning Gadget
	 * 
	 * @param gadget - Gadget
	 * @return boolean - if player is owning Gadget
	 */
	public boolean isOwningGadget(Gadget gadget) {
		return false;
	}

	/**
	 * Gets the Player @PlayerWorldSettings Object
	 * 
	 * @return
	 */
	public PlayerWorldSettings getSettings() {
		return null;
	}
}
