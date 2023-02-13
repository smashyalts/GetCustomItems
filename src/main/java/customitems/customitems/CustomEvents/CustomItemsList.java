package customitems.customitems.CustomEvents;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class CustomItemsList {

    public ItemStack SwordOfDestiny () {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = item.getItemMeta();
        Component itemLore = Component.text(ChatColor.DARK_RED + "This sword has the power to defeat any enemy with ease");
        itemMeta.lore(Collections.singletonList(itemLore));
        Component itemDisplay = Component.text(ChatColor.AQUA + "Sword Of Destiny");
        itemMeta.displayName(itemDisplay);
        item.setItemMeta(itemMeta);
        return item;
    }
    public ItemStack ScrollOfLevitation () {
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta itemMeta = item.getItemMeta();
        Component itemLore = Component.text(ChatColor.DARK_RED + "This scroll has the power to make u levitate");
        Component itemDisplay = Component.text(ChatColor.AQUA + "Scroll of Levitation");
        itemMeta.lore(Collections.singletonList(itemLore));
        itemMeta.displayName(itemDisplay);
        item.setItemMeta(itemMeta);
        return item;
    }
    public ItemStack FireExtinguisher () {
        ItemStack item = new ItemStack(Material.REDSTONE);
        ItemMeta itemMeta = item.getItemMeta();
        Component itemLore = Component.text(ChatColor.DARK_RED + "This item has the power to put out fires");
        Component itemDisplay = Component.text(ChatColor.AQUA + "Fire Extinguisher");
        itemMeta.lore(Collections.singletonList(itemLore));
        itemMeta.displayName(itemDisplay);
        item.setItemMeta(itemMeta);
        return item;
    }
}
