package srv.deathly.combo;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class onClick implements Listener{
	
	@EventHandler
    public void onClick(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Material items = player.getInventory().getItemInMainHand().getType();
		ItemStack item = player.getInventory().getItemInMainHand();
		Inventory inv = player.getInventory();
        String itemname = item.getItemMeta().getDisplayName();
        if (items == Material.NETHER_STAR && (itemname.equals(SIMPLE_PACKER_NAME)) && (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_AIR)) {
        	runBlock(player, inv);
			/**if (inv.contains(Material.COAL)) {
				makeBlock(player, Material.COAL);
			}
			
			if (inv.contains(Material.REDSTONE)){
				makeBlock(player, Material.REDSTONE);
			}
			
			if (inv.contains(Material.INK_SACK)) {
				MaterialData chk = new MaterialData((byte)4);
				int block = 9;
				int take = 0;
				int has = 0;
				for (ItemStack test : inv) {
					if ((test != null) && (test.getType() == Material.INK_SACK) && (item.getAmount() > 0)){
						has += item.getAmount();
					}
				}
				int total = has / block;
		    	int remainder = has % block;
		    	take = has - remainder;
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(351, take, (byte) 4)});
				if (total > 0){
					player.getInventory().addItem(new ItemStack(Material.LAPIS_BLOCK, total));
					player.updateInventory();
				}
				
			}
			
			if (inv.contains(Material.IRON_INGOT)){
				makeBlock(player, Material.IRON_INGOT);	
			} 
			
			if (inv.contains(Material.GOLD_INGOT)){
				makeBlock(player, Material.GOLD_INGOT);
			}
			
    		if (inv.contains(Material.DIAMOND)){
    			makeBlock(player, Material.DIAMOND);
    		}
    		
    		if (inv.contains(Material.EMERALD)){
    			makeBlock(player, Material.EMERALD);
    		}**/
        	
        }
	}

}
