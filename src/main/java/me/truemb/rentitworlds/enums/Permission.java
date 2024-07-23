package me.truemb.rentitworlds.enums;

public enum Permission {

	ACCESS,
	CHANGE_PERMISSIONS,
	CHANGE_SETTINGS,
	
	BUILD,
	BREAK,
	CHESTS,
	BUCKET,
	INTERACT,
	INTERACT_AT_ENTITY,
	
	ITEM_DROP,
	ITEM_PICKUP,
	ATTACK_PLAYER, //Could create a Trap for players, where guest can't hit members. So attacking only works, if both Players have permission
	ATTACK_MONSTER,
	ATTACK_MOBS;
	
	

	public static Permission getPermissionFromString(String s) {
		if(s == null)
			return null;
		
		for(Permission permissions : Permission.values())
			if(permissions.toString().equalsIgnoreCase(s))
				return permissions;
				
		return null;
	}
}
