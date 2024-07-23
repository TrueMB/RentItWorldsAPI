package me.truemb.rentitworlds.enums;

public enum WorldType {

	NORMAL,
	END,
	NETHER,
	REALM,
	BIOME,
	SEED,
	FLAT,
	CUSTOM,
	VOID;

	
	public static WorldType getWorldTypeFromString(String s) {
		if(s == null)
			return null;
		
		for(WorldType type : WorldType.values())
			if(type.toString().equalsIgnoreCase(s))
				return type;
				
		return null;
	}
}
