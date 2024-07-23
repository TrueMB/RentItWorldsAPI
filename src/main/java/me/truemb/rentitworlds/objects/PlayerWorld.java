package me.truemb.rentitworlds.objects;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import org.bukkit.block.Biome;

import me.truemb.rentitworlds.enums.Permission;
import me.truemb.rentitworlds.enums.WorldType;
import me.truemb.rentitworlds.enums.Gadget;
import me.truemb.rentitworlds.enums.Group;

public class PlayerWorld {
	
	/**
	 * The PlayerWorld Id. Used as a Unique Id.
	 * But will be reused, if world got deleted.
	 * 
	 * @return worldId
	 */
	public int getWorldId() {
		return -1;
	}

	/**
	 * Get the Owner Username
	 * 
	 * @return username
	 */
	public String getOwnerUsername() {
		return null;
	}

	/**
	 * Get the Owner UUID
	 * 
	 * @return uuid
	 */
	public UUID getOwnerUUID() {
		return null;
	}
	
	/**
	 * Is PlayerWorld owning Gadget?
	 * Only important if world only gadget is activated in the config.
	 * 
	 * @param gadget
	 * @return boolean
	 */
	public boolean isOwningGadget(Gadget gadget) {
		return false;
	}
	
	//WORLD PLAYER PERMISSIONS
	/**
	 * Has the Player an explicit Permission set?
	 * 
	 * @param memberUUID - UUID of the target
	 * @param permission - @Permission 
	 * 
	 * @return true if Permission was explicit set for the uuid.
	 */
	public boolean isPlayerPermissionSet(UUID memberUUID, Permission permission) {
		return false;
	}
	
	/**
	 * Has the Player the @Permission?
	 * This will also return false, even if Permission was never set by the Owner.
	 * Player could also have Permission through his @Group
	 * 
	 * @param memberUUID - UUID of the target
	 * @param permission - @Permission 
	 * 
	 * @return true if player has Permission
	 */
	public boolean hasPlayerPermission(UUID memberUUID, Permission permission) {
		return false;
	}

	/**
	 * Has the @Group the @Permission?
	 * 
	 * @param group - @Group
	 * @param permission - @Permission 
	 * 
	 * @return true if player has Permission
	 */
	public boolean hasGroupPermission(Group group, Permission permission) {
		return false;
	}
	
	/**
	 * Does Player have permission somewhere?
	 * Checks group, player permission and if player is owner
	 * 
	 * @param uuid - UUID of the target
	 * @param permission - @Permission 
	 * @return true if player has Permission
	 */
	public boolean hasPermission(UUID uuid, Permission permission) {
		return false;
	}
	
	/**
	 * Get the next Payday if world is rented.
	 * 
	 * @return Timestamp
	 */
	public Timestamp getPayday() {
		return null;
	}

	
	/**
	 * Get the world creation timestamp
	 * 
	 * @return Timestamp
	 */
	public Timestamp getWorldCreation() {
		return null;
	}

	
	/**
	 * Get the timestamp, since the world is paused.
	 * 
	 * @return Timestamp
	 */
	public Timestamp getPausedSince() {
		return null;
	}
	
	/**
	 * Is world paused by an admin?
	 * This won't subtract more rents of the PlayerWorld owner. But the world is also not access able anymore.
	 * 
	 * @return boolean
	 */
	public boolean isPaused() {
		return false;
	}

	/**
	 * Is Autopayment activated? Subtracts automatically the world rent, if Payday reached.
	 * Otherwise the Player needs to pay manually.
	 * 
	 * @return boolean
	 */
	public boolean isAutoPayment() {
		return false;
	}

	/**
	 * Is PlayerWorld currently loaded?
	 * 
	 * @return boolean
	 */
	public boolean isWorldLoaded() {
		return false;
	}

	/**
	 * Get the timestamp of the last time a player was in the world.
	 * 
	 * @return Timestamp
	 */
	public Timestamp getLastTimePlayerLeft() {
		return null;
	}
	
	/**
	 * Is player a Member of the world?
	 * 
	 * @param uuid - target UUID
	 * 
	 * @return boolean
	 */
	public boolean isMember(UUID uuid) {
		return false;
	}
	
	/**
	 * Does PlayerWorld contain MemberData(uuid)
	 * Contains also true, if Player is only invited, but not a member yet.
	 * 
	 * @param uuid - target uuid
	 * @return boolean
	 */
	public boolean hasMemberData(UUID uuid) {
		return false;
	}

	/**
	 * Get MemberData of the uuid
	 * 
	 * @param uuid - target uuid
	 * @return MemberData
	 */
	public MemberData getMemberData(UUID uuid) {
		return null;
	}
	
	/**
	 * Get the Member List of the current PlayerWorld
	 * 
	 * @return List<MemberData>
	 */
	public List<MemberData> getMembers() {
		return null;
	}
	
	/**
	 * Get all Member UUIDs of the current PlayerWorld
	 * 
	 * @return List<UUID>
	 */
	public List<UUID> getMembersUUIDs() {
		return null;
	}

	/**
	 * Get the PlayerWorldSettings explicit for the current PlayerWorld.
	 * 
	 * @return @PlayerWorldSettings
	 */
	public PlayerWorldSettings getSettings() {
		return null;
	}

	/**
	 * Gets the alias name of the world
	 * Null if not set
	 * 
	 * @return alias name
	 */
	public String getAlias() {
		return null;
	}

	/**
	 * Set the Alias Name for the PlayerWorld
	 * 
	 * @param alias - The alias name for the world
	 */
	public void setAlias(String alias) {}

	/**
	 * Gets the WorldType of the PlayerWorld
	 * 
	 * @return WorldType
	 */
	public WorldType getWorldType() {
		return null;
	}

	/**
	 * Gets the Biome from a Biome Only World Type
	 * 
	 * @return Biome
	 */
	public Biome getBiome() {
		return null;
	}
	
	/**
	 * Is World a Realm world and contains a Nether and End as well?
	 * 
	 * @return boolean - world is a Realm world
	 */
	public boolean isRealm() {
		return true;
	}

}
