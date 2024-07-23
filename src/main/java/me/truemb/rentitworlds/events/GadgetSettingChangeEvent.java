package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import me.truemb.rentitworlds.enums.Gadget;
import me.truemb.rentitworlds.enums.ValueAction;

/**
 * Gets called if a player changes an owning Gadget Setting
 */
public class GadgetSettingChangeEvent extends GadgetEvent {

	private static final HandlerList handlers = new HandlerList();
	
	private ValueAction valueAction;
	
	private boolean worldOnly;
	private int worldId;
	
	private boolean setTo;
	private String s;
	
	public GadgetSettingChangeEvent(Player p, Gadget gadget, int worldId, boolean worldOnly, ValueAction valueAction, boolean setTo, String s) {
		super(p, gadget);
		
		this.worldOnly = worldOnly;
		this.worldId = worldId;
		this.valueAction = valueAction;
		
		this.setTo = setTo;
		this.s = s;
	}
	
	public ValueAction getValueAction() {
		return this.valueAction;
	}
	
	public String getString() {
		return this.s;
	}

	public boolean getBoolean() {
		return this.setTo;
	}
	
	
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public boolean isWorldOnly() {
		return this.worldOnly;
	}

	public int getWorldId() {
		return worldId;
	}

}
