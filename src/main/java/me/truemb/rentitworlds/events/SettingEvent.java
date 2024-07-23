package me.truemb.rentitworlds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.truemb.rentitworlds.enums.Setting;

public class SettingEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private int worldId;
	private Setting setting;
	private Player player;

	public SettingEvent(int worldId, Setting setting, Player player) {
		this.worldId = worldId;
		this.setting = setting;
		this.player = player;
	}

	public int getWorldId() {
		return worldId;
	}
	
	public Setting getSetting() {
		return this.setting;
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
