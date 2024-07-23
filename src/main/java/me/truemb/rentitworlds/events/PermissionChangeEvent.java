package me.truemb.rentitworlds.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.enums.Group;
import me.truemb.rentitworlds.enums.Permission;
import me.truemb.rentitworlds.enums.ValueAction;

/**
 * Gets called if a player changes a Permission in his World
 */
public class PermissionChangeEvent extends PermissionEvent implements Cancellable{

	private static final HandlerList handlers = new HandlerList();

	private ValueAction action;
	private boolean valueTo;
	
	private boolean isCancelled;

	public PermissionChangeEvent(int worldId, Permission permission, ValueAction action, boolean valueTo, Group group, OfflinePlayer targetPlayer) {
		super(worldId, permission, group, targetPlayer);
		
		this.action = action;
		this.valueTo = valueTo;
	}

	public boolean getValueTo() {
		return this.valueTo;
	}

	public ValueAction getAction() {
		return this.action;
	}

	
	
	@Override
	public boolean isCancelled() {
		return this.isCancelled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.isCancelled = cancel;		
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
