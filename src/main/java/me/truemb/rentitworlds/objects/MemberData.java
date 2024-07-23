package me.truemb.rentitworlds.objects;

import java.util.UUID;

/**
 * MemberData if Player has anything to do with a PlayerWorld.
 * Gets created on invite.
 */
public class MemberData {
	
	private UUID uuid;
	private String username;
	
	private String inviter;
	private boolean invited;
	
	public MemberData(UUID uuid, String username) {
		this.uuid = uuid;
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public UUID getUUID() {
		return this.uuid;
	}
	
	public boolean isInvited() {
		return this.invited;
	}
	
	public String getInviter() {
		return this.inviter;
	}

}
