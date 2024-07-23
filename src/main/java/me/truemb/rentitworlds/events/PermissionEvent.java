package me.truemb.rentitworlds.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.enums.Group;
import me.truemb.rentitworlds.enums.Permission;

public class PermissionEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private int worldId;
	private Permission permission;
	private Group group;
	
	private OfflinePlayer targetPlayer; //If no Group Permission set, then it was for this player

	public PermissionEvent(int worldId, Permission permission, Group group, OfflinePlayer targetPlayer) {
		this.worldId = worldId;
		this.permission = permission;
		this.group = group;
		this.targetPlayer = targetPlayer;
	}

	public int getWorldId() {
		return worldId;
	}
	
	public Permission getPermission() {
		return this.permission;
	}

	public Group getGroup() {
		return this.group;
	}

	public OfflinePlayer getPlayer() {
		return this.targetPlayer;
	}
	
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
