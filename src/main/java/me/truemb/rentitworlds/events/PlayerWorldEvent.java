package me.truemb.rentitworlds.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import me.truemb.rentitworlds.objects.PlayerWorld;

public class PlayerWorldEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private PlayerWorld pw;

	public PlayerWorldEvent(PlayerWorld pw) {
		this(pw, false);
	}
	
	public PlayerWorldEvent(PlayerWorld pw, boolean async) {
		super(async);
		this.pw = pw;
	}

	public PlayerWorld getPlayerWorld() {
		return this.pw;
	}
	
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
