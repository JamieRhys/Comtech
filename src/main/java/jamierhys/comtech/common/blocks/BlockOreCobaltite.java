package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOreCobaltite extends Block {
    public BlockOreCobaltite() {
        super(Material.ROCK);

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setSoundType(SoundType.STONE);
        this.setResistance(10f);
        this.setHardness(10f);
        this.setHarvestLevel("pickaxe", 3);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "ore_cobaltite");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "ore_cobaltite");
        ModBlocks.registerOreDictionaryEntry("oreCobaltite", this);
    }
}