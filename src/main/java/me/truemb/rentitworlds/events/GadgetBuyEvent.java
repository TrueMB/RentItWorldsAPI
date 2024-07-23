package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import me.truemb.rentitworlds.enums.Gadget;

/**
 * Gets called if a player buys a Gadget
 */
public class GadgetBuyEvent extends GadgetEvent implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	
	private boolean isCanceled = false;

	private int worldId;
	private boolean worldOnly;
	private double price;
	
	public GadgetBuyEvent(Player player, int worldId, Gadget gadget, double price, boolean worldOnly) {
		super(player, gadget);
		
		this.worldId = worldId;
		this.price = price;
		this.worldOnly = worldOnly;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getWorldId() {
		return this.worldId;
	}

	public boolean isWorldOnly() {
		return this.worldOnly;
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
