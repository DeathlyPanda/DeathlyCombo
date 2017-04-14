package srv.deathly.combo;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class getAmount {
	
	public static int getAmount(Player player, Material id) {
        PlayerInventory inventory = player.getInventory();
        ItemStack[] items = inventory.getContents();
        int has = 0;
        for (ItemStack item : items) {
            if ((item != null) && (item.getType() == id) && (item.getAmount() > 0)) {
                has += item.getAmount();
            }
        }
       return has;
   }

}
