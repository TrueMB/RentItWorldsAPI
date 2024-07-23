package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.objects.PlayerWorld;

/**
 * Gets called if a player kicks a Player from his world
 */
public class AdminActionKickEvent extends AdminActionEvent implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	
	private boolean isCanceled = false;
	
	public AdminActionKickEvent(Player player, Player target, PlayerWorld playerWorld) {
		super(player, target, playerWorld);
	}
	
	

	@Override
	public boolean isCancelled() {
		return this.isCanceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.isCanceled = cancel;
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
