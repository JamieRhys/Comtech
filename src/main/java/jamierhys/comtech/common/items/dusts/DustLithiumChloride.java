package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class DustLithiumChloride extends Item {
    public DustLithiumChloride() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "dust_lithiumchloride");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "dust_lithiumchloride");
    }
}
