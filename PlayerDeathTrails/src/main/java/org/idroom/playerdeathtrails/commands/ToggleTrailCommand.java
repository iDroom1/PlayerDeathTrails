package org.idroom.playerdeathtrails.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.idroom.playerdeathtrails.PlayerDeathTrails;

public class ToggleTrailCommand implements CommandExecutor {

    private final PlayerDeathTrails plugin;

    public ToggleTrailCommand(PlayerDeathTrails plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        var disabledPlayers = plugin.getTrailDisabledPlayers();
        if (disabledPlayers.contains(player.getUniqueId())) {
            disabledPlayers.remove(player.getUniqueId());
            player.sendMessage("§aDeath trails enabled.");
        } else {
            disabledPlayers.add(player.getUniqueId());
            player.sendMessage("§cDeath trails disabled.");
        }
        return true;
    }
}
