package cn.nukkit.block;

import cn.nukkit.item.Item;

/**
 * @author explorer_3039
 */
public class BlockFenceGateWarped extends BlockFenceGate {

    public BlockFenceGateWarped() {
        this(0);
    }

    public BlockFenceGateWarped(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WARPED_FENCE_GATE;
    }

    @Override
    public String getName() {
        return "Warped Fence Gate";
    }
    
    @Override
    public int getBurnChance() {
        return 0;
    }

    @Override
    public int getBurnAbility() {
        return 0;
    }
}
