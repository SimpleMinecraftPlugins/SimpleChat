package com.ryderbelserion.simplechat;

import com.ryderbelserion.simplechat.api.SimpleManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleChat extends JavaPlugin {

    private SimpleManager simpleManager;

    @Override
    public void onEnable() {
        this.simpleManager = new SimpleManager(this);
        this.simpleManager.load();
    }

    @Override
    public void onDisable() {
        this.simpleManager.stop();
    }

    public SimpleManager getSimpleManager() {
        return this.simpleManager;
    }
}