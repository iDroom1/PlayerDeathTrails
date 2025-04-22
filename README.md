🎮 PlayerDeathTrails Plugin
An aesthetic plugin for Spigot 1.21 that leaves a particle trail from a player's death location to the spawn and includes a /toggletrail command to toggle the trails on or off.

📦 Features
✨ Particle Trails on Player Death
Leave a cool particle trail from the player's death location to the spawn.

⚙️ Toggle Trails Command
Use /toggletrail to enable or disable death trails for yourself.

🎨 Customizable
Configure the trail types, particle effects, and more in the plugin's configuration.

📥 Installation
Download the PlayerDeathTrails.jar file from the releases section.

Place the JAR file into your plugins folder of your Spigot server.

Restart or reload your server.

🛠️ Commands
/toggletrail
Toggle the particle death trail on or off for your player.

Permissions:
playerdeathtrails.toggle: Allows the player to use the /toggletrail command.

⚙️ Configuration
Once installed, you can customize the plugin by modifying the config.yml file located in the plugins/PlayerDeathTrails folder.

yaml
Copy
Edit
# Configuration for PlayerDeathTrails Plugin

# Enable/Disable the plugin
enabled: true

# Customize particle effects
particle-effect: "FLAME"

# Toggle trail visibility by default
default-trail-status: "false"

# Customize trail duration in ticks
trail-duration: 100
📌 How It Works
When a player dies, a particle trail will appear leading from their death location to the spawn point.

Use /toggletrail to enable or disable the trail effect for your player.

The plugin supports all major particle effects like FLAME, SMOKE, HEART, etc.

🌐 Links
GitHub Repository: YourRepoURL

Issues/Support: Create an issue

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

🙏 Acknowledgements
Special thanks to all the contributors and open-source projects that helped make this plugin possible!

