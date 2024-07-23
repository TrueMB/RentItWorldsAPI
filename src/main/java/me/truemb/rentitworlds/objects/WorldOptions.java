package me.truemb.rentitworlds.objects;

public class WorldOptions {
	
	/**
	 * Players getting automatically teleported on World Creation
	 * 
	 * @return boolean
	 */
	public boolean isTeleportOnCreate() {
		return false;
	}
	
	/**
	 * Should Player Respawn in the world where they die?
	 * 
	 * @return boolean
	 */
	public boolean isRespawn() {
		return false;
	}
	
	/**
	 * Should the PlayerWorld be loaded on Server start?
	 * 
	 * @return boolean
	 */
	public boolean isLoadOnStartup() {
		return false;
	}
	
	/**
	 * Keep Spawn in Memory for PlayerWorlds?
	 * 
	 * @return boolean
	 */
	public boolean isKeepSpawnInMemory() {
		return false;
	}
	
	/**
	 * Should players be teleported async into their world?
	 * Only works on PaperMC
	 * 
	 * @return boolean
	 */
	public boolean isTeleportAsync() {
		return false;
	}
	
	/**
	 * Is the feature unload empty PlayerWorlds active 
	 * 
	 * @return boolean
	 */
	public boolean isUnloadNoPlayerWorlds() {
		return true;
	}
	
	/**
	 * Get the Minutes that were set up in the config.
	 * If X Minutes Players weren't in the world, the world will be unloaded.
	 * 
	 * @return
	 */
	public int getUnloadNoPlayerWorldsDelay() {
		return -1;
	}

	/**
	 * PlayerWorld Directory Path
	 * 
	 * @return Path to the PlayerWorlds
	 */
	public String getWorldsSaveLocation() {
		return null;
	}

	/**
	 * Advancements are deactivated in PlayerWorlds
	 * 
	 * @return boolean if disabled
	 */
	public boolean isDisableAdvancements() {
		return false;
	}
	

}
