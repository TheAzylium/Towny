package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.nation.Nation;
import com.palmergames.bukkit.towny.object.town.Town;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class NationRemoveTownEvent extends Event  {

    private static final HandlerList handlers = new HandlerList();
    
    private Town town;
    private Nation nation;

    @Override
    public HandlerList getHandlers() {
    	
        return handlers;
    }
    
    public static HandlerList getHandlerList() {

		return handlers;
	}

    public NationRemoveTownEvent(Town town, Nation nation) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.town = town;
        this.nation = nation;
    }

    /**
     *
     * @return the town who has left a nation.
     */
    public Town getTown() {
        return town;
    }

    /**
     *
     * @return the nation the town has just left.
     */
    public Nation getNation() {
        return nation;
    }
    
}