package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-13
 */
public class BlockOreDiamondDeepslate extends BlockOreDiamond {
    public BlockOreDiamondDeepslate() {
        // Does nothing
    }

    @Override
    public int getId() {
        return DEEPSLATE_DIAMOND_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Diamond Ore";
    }

}
