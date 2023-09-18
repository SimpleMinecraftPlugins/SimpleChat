package com.ryderbelserion.simplechat;

import com.ryderbelserion.simplechat.api.SimpleHandler;
import com.ryderbelserion.simplechat.api.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleChat extends JavaPlugin {

    private SimpleHandler simpleHandler;

    @Override
    public void onEnable() {
        this.simpleHandler = new SimpleHandler(this);
        this.simpleHandler.load();

        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {
        this.simpleHandler.stop();
    }

    public SimpleHandler getSimpleManager() {
        return this.simpleHandler;
    }
}