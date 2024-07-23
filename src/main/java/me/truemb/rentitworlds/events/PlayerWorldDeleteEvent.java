package me.truemb.rentitworlds.events;

import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.enums.WorldDeleteReason;
import me.truemb.rentitworlds.objects.PlayerWorld;

/**
 * Gets called if a PlayerWorld gets deleted
 */
public class PlayerWorldDeleteEvent extends PlayerWorldEvent {

	private static final HandlerList handlers = new HandlerList();
	
	private WorldDeleteReason reason;

	public PlayerWorldDeleteEvent(PlayerWorld pw, WorldDeleteReason reason) {
		super(pw);
		this.reason = reason;
	}
	
	public PlayerWorldDeleteEvent(PlayerWorld pw, boolean async, WorldDeleteReason reason) {
		super(pw, async);
		this.reason = reason;
	}
	
	public WorldDeleteReason getWorldDeleteReason() {
		return this.reason;
	}
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
