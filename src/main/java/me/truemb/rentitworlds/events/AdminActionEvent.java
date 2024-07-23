package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.objects.PlayerWorld;

public class AdminActionEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;
	private Player target;
	private PlayerWorld playerWorld;

	public AdminActionEvent(Player player, Player target, PlayerWorld playerWorld) {
		this.player = player;
		this.target = target;
		this.playerWorld = playerWorld;
	}

	public Player getTarget() {
		return this.target;
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public PlayerWorld getPlayerWorld() {
		return this.playerWorld;
	}
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
