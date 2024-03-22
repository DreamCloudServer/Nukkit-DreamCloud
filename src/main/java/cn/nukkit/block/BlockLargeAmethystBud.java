package cn.nukkit.block;

public class BlockLargeAmethystBud extends BlockAmethystBud {
    @Override
    protected String getNamePrefix() {
        return "Large";
    }

    @Override
    public int getId() {
        return LARGE_AMETHYST_BUD;
    }

    @Override
    public int getLightLevel() {
        return 4;
    }
}
