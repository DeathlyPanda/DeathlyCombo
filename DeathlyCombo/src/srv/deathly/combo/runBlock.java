package srv.deathly.combo;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class runBlock {
	
	public void runBlock(Player player, Inventory inv){
		if (inv.contains(Material.COAL)) {
			makeBlock(player, Material.COAL);
		}
		
		if (inv.contains(Material.REDSTONE)){
			makeBlock(player, Material.REDSTONE);
		}
		
		if (inv.contains(Material.INK_SACK)) {
			ItemStack item = new ItemStack(Material.INK_SACK, 1, (short) 4);
			int block = 9;
			int take = 0;
			int has = 0;
			for (ItemStack test : inv) {
			
				if ((test != null) && (test.getData() == new ItemStack(Material.INK_SACK, 1, (short) 4).getData()) && (item.getAmount() > 0)){
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
		}
	}

}
