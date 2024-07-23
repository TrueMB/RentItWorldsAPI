package me.truemb.rentitworlds.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import me.truemb.rentitworlds.objects.PlayerWorld;

/**
 * Gets called if a PlayerWorld gets created
 */
public class PlayerWorldCreateEvent extends PlayerWorldEvent implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private boolean isCanceled = false;

	public PlayerWorldCreateEvent(PlayerWorld pw) {
		super(pw);
	}
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return this.isCanceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.isCanceled = cancel;
	}
}
