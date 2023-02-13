package customitems.customitems.CustomEvents;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collections;
import java.util.Objects;

import static org.bukkit.inventory.EquipmentSlot.HAND;

public class CustomItemEvents extends CustomItemsList implements Listener {
    @EventHandler
    public void UseSOD (PlayerInteractAtEntityEvent e) {
        Damageable victim = (Damageable) e.getRightClicked();
        if (e.getPlayer().getActiveItem().getItemMeta().equals(SwordOfDestiny().getItemMeta()) && e.getHand() == HAND) {
            if (e.getRightClicked() instanceof Damageable) {
                victim.setHealth(0);
            }
        }
    }
    @EventHandler
    public void UseSOL (PlayerInteractEvent e) {
        if (e.getItem().getItemMeta().equals(ScrollOfLevitation().getItemMeta()) && Objects.equals(e.getHand(), EquipmentSlot.HAND) && e.getAction().isRightClick()) {
            e.getPlayer().getActiveItem().subtract(1);
            e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 1));
        }
    }
    @EventHandler
    public void UseFireExtinguisher (PlayerInteractAtEntityEvent e) {
        Damageable victim = (Damageable) e.getRightClicked();
        if (e.getPlayer().getActiveItem().getItemMeta().equals(FireExtinguisher().getItemMeta()) && e.getHand() == HAND) {
            if (e.getRightClicked() instanceof Damageable) {
                victim.setFireTicks(0);
            }
        }
    }
}
