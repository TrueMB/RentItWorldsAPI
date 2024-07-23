package me.truemb.rentitworlds.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.enums.Setting;

/**
 * Gets called if a Player changes a Setting
 */
public class SettingChangeEvent extends SettingEvent implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	
	private Location location;
	private boolean value;
	private long amount;
	private String s;
	
	private boolean isAllowed;
	
	private boolean canceled;

	public SettingChangeEvent(int worldId, Setting setting, Player player, boolean isAllowed, Location loc, boolean value, long amount, String s) {
		super(worldId, setting, player);
		this.isAllowed = isAllowed;
		
		this.location = loc;
		this.value = value;
		this.amount = amount;
		this.s = s;
	}
	
	public boolean isAllowed() {
		return this.isAllowed;
	}

	public Location getLocation() {
		return this.location;
	}
	
	public boolean getBoolean() {
		return this.value;
	}
		
	public long getAmount() {
		return this.amount;
	}

	public String getString() {
		return this.s;
	}
	
	
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return this.canceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.canceled = cancel;
	}
}
