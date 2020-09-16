package org.l2x9.dispensermetafix;

import org.bukkit.plugin.java.JavaPlugin;

public final class Dispensermetafix extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityDamageEvent(this), this);
        saveDefaultConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
