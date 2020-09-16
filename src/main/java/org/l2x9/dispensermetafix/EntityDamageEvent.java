package org.l2x9.dispensermetafix;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryType;

public class EntityDamageEvent implements Listener {
    Dispensermetafix plugin;

    public EntityDamageEvent(Dispensermetafix dispensermetafix) {
        plugin = dispensermetafix;
    }

    @EventHandler
    public void onClick(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            if (event.getDamage() > 30) {
                if (!(player.getOpenInventory().getTopInventory().getType() == InventoryType.HOPPER)) {
                    event.setCancelled(true);
//                    Inventory inventory = player.getOpenInventory().getTopInventory();
//                    for (ItemStack stack : inventory.getContents()) {
//                        if (stack != null && ) {
//                            Map.Entry<Enchantment, Integer> enchants = stack.getEnchantments().entrySet().iterator().next();
//                            if (!(enchants.getValue() > 5)) {
//                                event.setCancelled(true);
//                            }
//                        }
//                    }
                }
            }
        }
    }
}