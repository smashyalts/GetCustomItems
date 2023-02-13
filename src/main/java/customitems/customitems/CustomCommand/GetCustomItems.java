package customitems.customitems.CustomCommand;

import customitems.customitems.CustomEvents.CustomItemsList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class GetCustomItems implements CommandExecutor {

    private CustomItemsList ItemLIST = new CustomItemsList();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (!sender.hasPermission("customitems.admin")) {
            player.sendMessage("You have not provided sufficient permissions, missing customitems.admin");
            return true;
        }

        if (args.length == 0) {
            player.sendMessage("You have not provided sufficient args, expecting 1, received 0");
            return true;
        }

        if (args[0].equalsIgnoreCase("SOL")) {
            player.getInventory().addItem(ItemLIST.ScrollOfLevitation());
        }
        else if (args[0].equalsIgnoreCase("SOD")) {
            player.getInventory().addItem(ItemLIST.SwordOfDestiny());
        }
        else if (args[0].equalsIgnoreCase("FireExtinguisher")) {
            player.getInventory().addItem(ItemLIST.FireExtinguisher());
        }
        return true;
    }
}
