package me.truemb.rentitworlds.enums;

public enum Setting {

	ALIAS(false),
	
	PVP(true),
	PLAYER_HUNGER(true),
	JOIN_AT_SPAWN(true),
	WEATHER_CYCLE(true),
	PLAYER_LIMIT(false),
	CHANGE_SPAWN_LOCATION(false),
	
	CHANGE_WEATHER(false),
	CHANGE_TIME(false),
	CHANGE_DIFFICULTY(false);
	
	private boolean valueSetting;
	
	private Setting(boolean valueSetting) {
		this.valueSetting = valueSetting;
	}
	
	public boolean isValueSetting() {
		return this.valueSetting;
	}

	public static Setting getSettingFromString(String s) {
		if(s == null)
			return null;
		
		for(Setting settings : Setting.values())
			if(settings.toString().equalsIgnoreCase(s))
				return settings;
				
		return null;
	}
	
}
