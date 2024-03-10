package cn.nukkit.block;

import cn.nukkit.level.Level;

public class BlockFireSoul extends BlockFire {
    public BlockFireSoul(){
        this(0);
    }

    public BlockFireSoul(int meta){
        super(meta);
    }

    @Override
    public int getId() {
        return SOUL_FIRE;
    }

    @Override
    public String getName() {
        return "Soul Fire Block";
    }

    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_NORMAL) {
            int downId = down().getId();
            if (downId != Block.SOUL_SAND && downId != Block.SOUL_SOIL) {
                this.getLevel().setBlock(this, Block.get(BlockID.FIRE), true);
            }
            return type;
        }
        return 0;
    }

}
