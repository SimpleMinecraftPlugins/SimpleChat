package com.ryderbelserion.simplechat;

import com.ryderbelserion.simplechat.api.SimpleHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleChat extends JavaPlugin {

    private SimpleHandler simpleHandler;

    @Override
    public void onEnable() {
        this.simpleHandler = new SimpleHandler(this);
        this.simpleHandler.load();
    }

    @Override
    public void onDisable() {
        this.simpleHandler.stop();
    }

    public SimpleHandler getSimpleManager() {
        return this.simpleHandler;
    }
}