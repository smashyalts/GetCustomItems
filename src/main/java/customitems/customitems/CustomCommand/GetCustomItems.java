package customitems.customitems.CustomCommand;

import customitems.customitems.CustomEvents.CustomItemsList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class GetCustomItems extends CustomItemsList implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("customitems.admin")) {

            if (command.getName().equalsIgnoreCase("getcustomitems") && Arrays.toString(args).equalsIgnoreCase("SOL")) {
                    ((Player) sender).getInventory().addItem(SOLItem); }
            else if (command.getName().equalsIgnoreCase("getcustomitems") && Arrays.toString(args).equalsIgnoreCase("SOD")) {
                    ((Player) sender).getInventory().addItem(SODItem); }
            else if (command.getName().equalsIgnoreCase("getcustomitems") && Arrays.toString(args).equalsIgnoreCase("FireExtinguisher")) {
                ((Player) sender).getInventory().addItem(FireExtinguisher);
            }
            }
         return true;
        }
    }