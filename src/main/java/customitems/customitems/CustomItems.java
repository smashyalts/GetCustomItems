package customitems.customitems;

import customitems.customitems.CustomCommand.GetCustomItems;
import customitems.customitems.CustomEvents.CustomItemEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new CustomItemEvents(), this);
        getCommand("getcustomitems").setExecutor(new GetCustomItems());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
