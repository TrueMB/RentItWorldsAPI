package me.truemb.rentitworlds.enums;

public enum WeatherType {
	
	CLEAR,
	RAINING,
	STORM;

	
	public static WeatherType getWorldWeatherFromString(String s) {
		if(s == null)
			return null;
		
		for(WeatherType type : WeatherType.values())
			if(type.toString().equalsIgnoreCase(s))
				return type;
				
		return null;
	}
}
