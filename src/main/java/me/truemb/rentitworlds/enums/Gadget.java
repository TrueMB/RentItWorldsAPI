package me.truemb.rentitworlds.enums;

public enum Gadget {
	
	CREEPER_EXPLOSION(true),
	CREEPER_BLOCK_EXPLOSION(true),
	ENDERMAN_GRIEF(true),
	GHAST_FIREBALL(true),
	OTHER_EXPLOSION(true),
	FIRE_SPREAD(true),
	SNOWMAN_TRAILS(true),
	RAVAGER_GRIEF(true),
	
	PLAYER_FLY(true),
	REALTIME(true),

	CUSTOM_INFO(false),
	MOTD(false),
	JOIN_MESSAGE(false),
	LEAVE_MESSAGE(false),
	EXTEND_BORDER(false);
	

	private boolean valueSetting;
	
	private Gadget(boolean valueSetting) {
		this.valueSetting = valueSetting;
	}
	
	public boolean isValueSetting() {
		return this.valueSetting;
	}

	public static Gadget getShopGadgetFromString(String s) {
		if(s == null)
			return null;
		
		for(Gadget gadget : Gadget.values())
			if(gadget.toString().equalsIgnoreCase(s))
				return gadget;
				
		return null;
	}
	

}
