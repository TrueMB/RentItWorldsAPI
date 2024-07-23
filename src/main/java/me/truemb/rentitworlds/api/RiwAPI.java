package me.truemb.rentitworlds.api;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.truemb.rentitworlds.enums.Permission;
import me.truemb.rentitworlds.objects.PlayerWorld;

public class RiwAPI {
	
	/**
	 * Is Bukkit World a PlayerWorld
	 * 
	 * @param world - The Bukkit World
	 * @return boolean
	 */
	public boolean isPlayerWorld(World world) {
		return false;
	}

	/**
	 * Is Bukkit Worldname a PlayerWorld
	 * 
	 * @param worldname - The Bukkit Worldname
	 * @return boolean
	 */
	public boolean isPlayerWorld(String worldname) {
		return false;
	}

	/**
	 * Get the PlayerWorld Id from a Bukkit World
	 * 
	 * @param world - The Bukkit World
	 * @return worldId - The WorldId of the PlayerWorld
	 */
	public int getPlayerWorldId(World world) {
		return -1;
	}

	/**
	 * Get the PlayerWorld Id from a Bukkit Worldname
	 * 
	 * @param worldname - The Bukkit Worldname
	 * @return worldId - The WorldId of the PlayerWorld
	 */
	public int getPlayerWorldId(String worldname) {
		return -1;
	}
	
	/**
	 * Get the PlayerWorld Object from a worldId
	 * 
	 * @return worldId - The WorldId of a PlayerWorld
	 * @return PlayerWorld - The PlayerWorld Object
	 */
	public PlayerWorld getPlayerWorld(int worldId) {
		return null;
	}

	/**
	 * Returns the set Lobby Spawn Location.
	 * If none was set, then the default world Spawn Location will be returned.
	 * 
	 * This method is used to teleport Players to the Location, after they deleted their world or got deleted.
	 * 
	 * @return Location - Lobby Spawn
	 */
	public Location getLobbySpawn() {
		return null;
	}
	
	/**
	 * Get Players from the PlayerWorld.
	 * This Method will also return Players from the whole Realm (overworld, nether, end)
	 * 
	 * @param pw - The PlayerWorld Object
	 * @return List<Player> - Players in the world
	 */
	public List<Player> getPlayers(PlayerWorld pw) {
		return null;
	}
	
	/**
	 * This methods checks if the target Player has the Permission in the PlayerWorld.
	 * It checks in all groups that the Player has and the User Permission itself.
	 * 
	 * @param pw - The PlayerWorld Object
	 * @param uuid - Target UUID to check the Permission
	 * @param permission - @Permission to check
	 * 
	 * @return boolean - if Player has the permission
	 */
	public boolean hasPlayerWorldPermission(PlayerWorld pw, UUID uuid, Permission permission) {
		return false;
	}
	
	/**
	 * Get the Bukkit Worlds from a worldId.
	 * A List is retuned, since Realms always contain the Nether and End as well.
	 * Otherwise the List will only return one world.
	 * 
	 * Will always contain a World. But could be null
	 * 
	 * @param worldId - The PlayerWorld Id
	 * @return List<World> - The Bukkit Worlds
	 */
	public List<World> getBukkitWorlds(int worldId) {
		return null;
	}
	
	
	/**
	 * Get all PlayerWorlds that the Player is owning
	 * 
	 * @param uuid - Player UUID
	 * @return List<PlayerWorld> - Contains all PlayerWorlds where the uuid is owner
	 */
	public List<PlayerWorld> getPlayerWorlds(UUID uuid){
		return null;
	}
	
	/**
	 * Get all PlayerWorlds from the Server
	 * 
	 * @return Collection<PlayerWorld> - A List with all PlayerWorlds
	 */
	public Collection<PlayerWorld> getAllPlayerWorlds(){
		return null;
	}
	
	
	/**
	 * Load a Bukkit World from a PlayerWorld Object
	 * 
	 * @param pw - The PlayerWorld Object
	 */
	public void loadWorld(PlayerWorld pw) {}
	
	/**
	 * Load a Bukkit World from a PlayerWorld Object
	 * 
	 * @param pw - The PlayerWorld Object
	 * @param consumer - Consumer which will be done after the world is loaded.
	 */
	public void loadWorld(PlayerWorld pw, Consumer<Boolean> consumer) {}
}
