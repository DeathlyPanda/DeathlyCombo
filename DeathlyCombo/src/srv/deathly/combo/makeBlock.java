package srv.deathly.combo;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class makeBlock {
	
	public void makeBlock(Player player, Material id){
		int block = 9;
		int take = 0;
		int count = getAmount(player, id);
		int total = count / block;
    	int remainder = count % block;
    	take = count - remainder;
    	player.sendMessage("Sent to makeBlock");
		if (total > 0){
			if (id == Material.COAL){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.COAL_BLOCK, total));
				player.updateInventory();				
			}
			if (id == Material.REDSTONE){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.REDSTONE_BLOCK, total));
				player.updateInventory();		
			}
			if (id == Material.IRON_INGOT){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.IRON_BLOCK, total));
				player.updateInventory();
			}
			if (id == Material.GOLD_INGOT){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.GOLD_BLOCK, total));
				player.updateInventory();		
			}
			if (id == Material.EMERALD){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.EMERALD_BLOCK, total));
				player.updateInventory();
				
			}
			if (id == Material.DIAMOND){
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, take)});
				player.getInventory().removeItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack[] {new ItemStack(id, remainder)});
				player.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK, total));
				player.updateInventory();
				
			}
		}
		
	}

}
