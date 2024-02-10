package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCutExposed extends BlockCopperCut {
    public BlockCopperCutExposed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Exposed Cut Copper";
    }

    @Override
    public int getId() {
        return EXPOSED_CUT_COPPER;
    }
}
