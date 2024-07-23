package me.truemb.rentitworlds.objects;

import me.truemb.rentitworlds.enums.Group;
import me.truemb.rentitworlds.enums.PluginMode;

public class PluginOptions {
	
	/**
	 * Get the current running PluginMode
	 * 
	 * @return @PluginMode
	 */
	public PluginMode getPluginMode() {
		return null;
	}
	
	/**
	 * Get the Rent Contract defined config time
	 * 
	 * @return String like 3m or 5h
	 */
	public String getRentContractTime() {
		return null;
	}
	
	/**
	 * Get the Rent price. Needed to pay after each @getRentContractTime
	 * 
	 * @return
	 */
	public double getRentingPrice() {
		return -1D;
	}

	/**
	 * Get the Expiration defined config time
	 * 
	 * @return String like 3m or 5h
	 */
	public String getExpirationTime() {
		return null;
	}
	
	/**
	 * A player with at least this group, needs to join the server to extend the expiration time
	 * if @isOnlineInWorld then even the world
	 * 
	 * @return @Group
	 */
	public Group getLowestGroupToCheck() {
		return null;
	}

	/**
	 * Player needs to join the world to extend the expiration time
	 * 
	 * @return
	 */
	public boolean isOnlineInWorld() {
		return false;
	}
	
	/**
	 * World needs to be only bought once. This is the buy price.
	 * 
	 * @return Price to buy a world
	 */
	public double getUnlimitedPrice() {
		return -1D;
	}

}
