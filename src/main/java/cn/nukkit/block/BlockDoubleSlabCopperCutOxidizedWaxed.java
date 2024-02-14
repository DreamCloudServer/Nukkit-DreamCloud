package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutOxidizedWaxed extends BlockDoubleSlabCopperCutOxidized {
    public BlockDoubleSlabCopperCutOxidizedWaxed() {
        this(0);
    }

    public BlockDoubleSlabCopperCutOxidizedWaxed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB;
    }

}
