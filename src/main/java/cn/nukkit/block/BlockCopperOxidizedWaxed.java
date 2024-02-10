package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperOxidizedWaxed extends BlockCopperOxidized {
    public BlockCopperOxidizedWaxed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Waxed Oxidized Copper";
    }

    @Override
    public int getId() {
        return WAXED_OXIDIZED_COPPER;
    }
}
