package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCutWaxed extends BlockCopperCut {
    public BlockCopperCutWaxed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Waxed Cut Copper";
    }

    @Override
    public int getId() {
        return WAXED_CUT_COPPER;
    }
}
