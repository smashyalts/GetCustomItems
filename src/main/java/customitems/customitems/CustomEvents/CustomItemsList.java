package customitems.customitems.CustomEvents;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class CustomItemsList {
    protected ItemStack SODItem;
    ItemMeta SODMeta;
    ItemMeta SOLMeta;
    ItemMeta FireMeta;
    protected ItemStack FireExtinguisher;
    protected ItemStack SOLItem;
    public void SwordOfDestiny () {
        Component SODLore = Component.text(ChatColor.DARK_RED + "This sword has the power to defeat any enemy with ease");
        SODMeta.lore(Collections.singletonList(SODLore));
        Component SODDisplay = Component.text(ChatColor.AQUA + "Sword Of Destiny");
        SODMeta.displayName(SODDisplay);
        SODItem.setItemMeta(SODMeta);
        SODItem.setType(Material.DIAMOND_SWORD);
    }
    public void ScrollOfLevitation() {
        Component SOLLore = Component.text(ChatColor.DARK_RED + "This scroll has the power to make u levitate");
        Component SOLDisplay = Component.text(ChatColor.AQUA + "Scroll of Levitation");
        SOLItem.setItemMeta(SOLMeta);
        SOLItem.setType(Material.PAPER);
    }
    public void FireExtinguisher() {
        Component FireLore = Component.text(ChatColor.DARK_RED + "This item has the power to put out fires");
        Component FireDisplay = Component.text(ChatColor.AQUA + "Fire Extinguisher");
        FireExtinguisher.setItemMeta(FireMeta);
        FireExtinguisher.setType(Material.REDSTONE);
    }
}
