package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockStairsCopperCutExposed extends BlockStairsCopperCut {
    public BlockStairsCopperCutExposed() {
        this(0);
    }

    public BlockStairsCopperCutExposed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return EXPOSED_CUT_COPPER_STAIRS;
    }

}
