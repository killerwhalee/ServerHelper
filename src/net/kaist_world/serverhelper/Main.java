package net.kaist_world.serverhelper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable () {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "Enabled!");
    }

    @Override
    public void onDisable () {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Disabled!");
    }
}
