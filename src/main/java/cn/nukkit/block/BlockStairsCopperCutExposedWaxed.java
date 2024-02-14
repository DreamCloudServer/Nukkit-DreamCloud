package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockStairsCopperCutExposedWaxed extends BlockStairsCopperCutExposed {
    public BlockStairsCopperCutExposedWaxed() {
        this(0);
    }

    public BlockStairsCopperCutExposedWaxed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WAXED_EXPOSED_CUT_COPPER_STAIRS;
    }
}
