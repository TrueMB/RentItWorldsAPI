package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import me.truemb.rentitworlds.enums.Gadget;

public class GadgetEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;
	private Gadget gadget;

	public GadgetEvent(Player player, Gadget gadget) {
		this.player = player;
		this.gadget = gadget;
	}

	public Gadget getGadget() {
		return this.gadget;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
