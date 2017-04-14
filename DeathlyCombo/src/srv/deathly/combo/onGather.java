package srv.deathly.combo;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class onGather implements Listener{
	
	@EventHandler
	public void onGather(PlayerPickupItemEvent event){
		Player player = event.getPlayer();
		/**ItemStack pick = event.getItem().getItemStack();
		player.getInventory().addItem(new ItemStack[] {new ItemStack(pick)});**/
		Inventory inv = player.getInventory();
		player.sendMessage("onGather Activated!");
		final ItemStack check = new ItemStack(Material.NETHER_STAR, 1);
	    ItemMeta checkMeta = check.getItemMeta();
	    checkMeta.setDisplayName(AUTO_PACKER_NAME);
	    checkMeta.setLore(AUTO_PACKER_LORE);
	    check.setItemMeta(checkMeta);
	    if (inv.contains(check)){
	    	runBlock(player, inv);

	    }

	}

}
