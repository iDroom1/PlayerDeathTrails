package org.idroom.playerdeathtrails.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.idroom.playerdeathtrails.PlayerDeathTrails;

public class PlayerDeathListener implements Listener {

    private final PlayerDeathTrails plugin;

    public PlayerDeathListener(PlayerDeathTrails plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        var player = event.getEntity();
        if (plugin.getTrailDisabledPlayers().contains(player.getUniqueId())) return;

        Location start = player.getLocation();
        Location end = player.getWorld().getSpawnLocation();

        new BukkitRunnable() {
            double t = 0;

            @Override
            public void run() {
                if (t >= 1) {
                    cancel();
                    return;
                }
                Location point = start.clone().add(end.clone().subtract(start).toVector().multiply(t));
                player.getWorld().spawnParticle(Particle.END_ROD, point, 1, 0, 0, 0, 0);
                t += 0.02;
            }
        }.runTaskTimer(plugin, 0L, 1L);

        // Optional removal logic after a minute could be added if needed
    }
}
