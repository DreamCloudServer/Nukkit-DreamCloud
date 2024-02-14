package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockStairsCopperCutOxidized extends BlockStairsCopperCut {
    public BlockStairsCopperCutOxidized() {
        this(0);
    }

    public BlockStairsCopperCutOxidized(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return OXIDIZED_CUT_COPPER_STAIRS;
    }

}
