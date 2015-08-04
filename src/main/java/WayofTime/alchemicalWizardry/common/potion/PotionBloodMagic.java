package WayofTime.alchemicalWizardry.common.potion;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBloodMagic extends Potion
{
    public PotionBloodMagic(int par1, boolean par2, int par3)
    {
        super(par1, new ResourceLocation("speed"),par2, par3);
    }

    @Override
    public Potion setIconIndex(int par1, int par2)
    {
        super.setIconIndex(par1, par2);
        return this;
    }
}