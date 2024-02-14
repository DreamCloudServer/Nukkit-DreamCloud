package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutWeatheredWaxed extends BlockDoubleSlabCopperCutWeathered {
    public BlockDoubleSlabCopperCutWeatheredWaxed() {
        this(0);
    }

    public BlockDoubleSlabCopperCutWeatheredWaxed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB;
    }

}
