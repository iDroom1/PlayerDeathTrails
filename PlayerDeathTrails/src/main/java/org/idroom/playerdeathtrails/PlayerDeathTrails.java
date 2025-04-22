package org.idroom.playerdeathtrails;

import org.bukkit.plugin.java.JavaPlugin;
import org.idroom.playerdeathtrails.commands.ToggleTrailCommand;
import org.idroom.playerdeathtrails.listeners.PlayerDeathListener;

import java.util.HashSet;
import java.util.UUID;

public class PlayerDeathTrails extends JavaPlugin {

    private final HashSet<UUID> trailDisabledPlayers = new HashSet<>();

    @Override
    public void onEnable() {
        getLogger().info("PlayerDeathTrails enabled!");
        getCommand("toggletrail").setExecutor(new ToggleTrailCommand(this));
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("PlayerDeathTrails disabled.");
    }

    public HashSet<UUID> getTrailDisabledPlayers() {
        return trailDisabledPlayers;
    }
}
