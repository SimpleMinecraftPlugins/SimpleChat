package com.ryderbelserion.simplechat.api;

import com.ryderbelserion.cluster.api.RootPlugin;
import com.ryderbelserion.cluster.api.adventure.FancyLogger;
import com.ryderbelserion.cluster.bukkit.BukkitPlugin;
import com.ryderbelserion.simplechat.SimpleChat;

public class SimpleHandler {

    private final SimpleChat plugin;

    public SimpleHandler(SimpleChat plugin) {
        this.plugin = plugin;
    }

    private BukkitPlugin bukkitPlugin;

    public void load() {
        RootPlugin.setConsole(this.plugin.getServer().getConsoleSender());
        FancyLogger.setName("<green>[SimpleChat]</green>");

        this.bukkitPlugin = new BukkitPlugin(this.plugin);
        this.bukkitPlugin.enable();
    }

    public void stop() {

    }

    public BukkitPlugin getBukkitPlugin() {
        return this.bukkitPlugin;
    }
}