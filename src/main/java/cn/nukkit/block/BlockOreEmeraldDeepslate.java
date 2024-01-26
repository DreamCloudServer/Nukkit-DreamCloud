package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-13
 */
public class BlockOreEmeraldDeepslate extends BlockOreEmerald {
    public BlockOreEmeraldDeepslate() {
        // Does nothing
    }

    @Override
    public int getId() {
        return DEEPSLATE_EMERALD_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Emerald Ore";
    }

}
