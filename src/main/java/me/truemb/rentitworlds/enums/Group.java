package me.truemb.rentitworlds.enums;

public enum Group {
	
	OWNER(3),
	MEMBER(2),
	GUEST(1),
	NONE(0); //USED FOR PLAYER PERMISSIONS GUI

	private int priority;
	
	private Group(int priority) {
		this.priority = priority;
	}
	
	public static Group getGroupFromString(String s) {
		if(s == null)
			return null;
		
		for(Group groups : Group.values())
			if(groups.toString().equalsIgnoreCase(s))
				return groups;
				
		return null;
	}

	public int getPriority() {
		return this.priority;
	}
	
}
