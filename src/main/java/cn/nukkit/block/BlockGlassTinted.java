package cn.nukkit.block;

import cn.nukkit.item.Item;

/**
 * @author LoboMetalurgico
 * @since 13/06/2021
 */

public class BlockGlassTinted extends BlockGlass {
    public BlockGlassTinted() {

    }

    @Override
    public String getName() {
        return "Tinted Glass";
    }

    @Override
    public int getId() {
        return TINTED_GLASS;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[] { toItem() };
    }

    @Override
    public boolean canSilkTouch() {
        return false;
    }
}
