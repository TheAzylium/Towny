package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.town.Town;
import com.palmergames.bukkit.towny.object.world.WorldCoord;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerLeaveTownEvent extends Event {
	private static final HandlerList handlers = new HandlerList();

	private Town lefttown;
	private PlayerMoveEvent pme;
	private WorldCoord from;
	private Player player;
	private WorldCoord to;

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public PlayerLeaveTownEvent(Player player, WorldCoord to, WorldCoord from, Town lefttown, PlayerMoveEvent pme) {
		super(!Bukkit.getServer().isPrimaryThread());
		this.lefttown = lefttown;
		this.player = player;
		this.from = from;
		this.pme = pme;
		this.to = to;
	}

	public Player getPlayer() {
		return player;
	}

	public PlayerMoveEvent getPlayerMoveEvent() {
		return pme;
	}

	public Town getLefttown() {
		return lefttown;
	}

	public WorldCoord getFrom() {
		return from;
	}

	public WorldCoord getTo() {
		return to;
	}
}
