package srv.deathly.combo.Items;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import srv.deathly.combo.Main;

public class Packers extends Main{
	
	public final String SIMPLE_PACKER_NAME = ChatColor.DARK_BLUE + "Simple Packer";
	public final List<String> SIMPLE_PACKER_LORE = Arrays.asList("Item Packer Tool");
	public final String AUTO_PACKER_NAME = ChatColor.DARK_PURPLE + "Auto Packer";
	public final List<String> AUTO_PACKER_LORE = Arrays.asList("Automatically packs items if in inventory.");
	public final String COMPRESSED_OBSIDIAN_NAME = ChatColor.DARK_PURPLE + "Compressed Obsidian";
	public final List<String> COMPRESSED_OBSIDIAN_LORE = Arrays.asList("This obsidian has been compressed for hard work.");
	public final String BOOSTED_STAR_NAME = ChatColor.DARK_RED + "Boosted Nether Star";
	public final List<String> BOOSTED_STAR_LORE = Arrays.asList("A supercharged nether star.");
	
    public void initializesPackerMeta(ItemStack itemPacker) {
	    ItemMeta packerMeta = itemPacker.getItemMeta();
	    packerMeta.setDisplayName(SIMPLE_PACKER_NAME);
	    packerMeta.setLore(SIMPLE_PACKER_LORE);
	    itemPacker.setItemMeta(packerMeta);
	}
    
    public void initializecObsidianMeta(ItemStack cObsidian) {
	    ItemMeta obsidianMeta = cObsidian.getItemMeta();
	    obsidianMeta.setDisplayName(COMPRESSED_OBSIDIAN_NAME);
	    obsidianMeta.setLore(COMPRESSED_OBSIDIAN_LORE);
	    cObsidian.setItemMeta(obsidianMeta);
	}
    
    public void initializebStarMeta(ItemStack bStar) {
	    ItemMeta starMeta = bStar.getItemMeta();
	    starMeta.setDisplayName(BOOSTED_STAR_NAME);
	    starMeta.setLore(BOOSTED_STAR_LORE);
	    bStar.setItemMeta(starMeta);
	}
	
	public void initializeRecipes() {
	    initializesPackerRecipe();
	}
	
	public void initializesPackerRecipe() {
	    ItemStack simplePacker = new ItemStack(Material.NETHER_STAR);
	    ItemStack autoPacker = new ItemStack(Material.NETHER_STAR);
	    ItemStack cObsidian = new ItemStack(Material.OBSIDIAN);
	    ItemStack bStar = new ItemStack(Material.NETHER_STAR);
	    initializesPackerMeta(simplePacker);
	    initializeaPackerMeta(autoPacker);
	    initializecObsidianMeta(cObsidian);
	    initializebStarMeta(bStar);
	   
	    ShapedRecipe spackerRecipe = new ShapedRecipe(simplePacker);
	    spackerRecipe.shape("IWI", "WCW", "IEI");
	    spackerRecipe.setIngredient('I', Material.OBSIDIAN);
	    spackerRecipe.setIngredient('C', Material.NETHER_STAR);
	    spackerRecipe.setIngredient('W', Material.DIAMOND_BLOCK);
	    spackerRecipe.setIngredient('E', Material.WORKBENCH);
	    
	    ShapedRecipe apackerRecipe = new ShapedRecipe(autoPacker);
	    apackerRecipe.shape("WWW", "ICI", "IEI");
	    apackerRecipe.setIngredient('I', Material.IRON_BLOCK);
	    apackerRecipe.setIngredient('C', Material.NETHER_STAR);
	    apackerRecipe.setIngredient('W', Material.DIAMOND_BLOCK);
	    apackerRecipe.setIngredient('E', Material.WORKBENCH);
	    
	    ShapedRecipe cObsidianRecipe = new ShapedRecipe(cObsidian);
	    cObsidianRecipe.shape("III", "III", "III");
	    cObsidianRecipe.setIngredient('I', Material.OBSIDIAN);
	    
	    ShapedRecipe bStarRecipe = new ShapedRecipe(bStar);
	    bStarRecipe.shape("III", "III", "III");
	    bStarRecipe.setIngredient('I', Material.NETHER_STAR);
	    
	    Bukkit.getServer().addRecipe(spackerRecipe);
	    Bukkit.addRecipe(apackerRecipe);
	    Bukkit.getServer().addRecipe(cObsidianRecipe);
	    Bukkit.getServer().addRecipe(bStarRecipe);
	}
	private void initializeaPackerMeta(ItemStack nautoPacker) {
	    ItemMeta apackerMeta = nautoPacker.getItemMeta();
	    apackerMeta.setDisplayName(AUTO_PACKER_NAME);
	    apackerMeta.setLore(AUTO_PACKER_LORE);
	    nautoPacker.setItemMeta(apackerMeta);
	}

}
