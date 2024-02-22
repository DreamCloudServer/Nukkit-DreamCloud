package cn.nukkit.item;

import cn.nukkit.network.protocol.ProtocolInfo;

/**
 * @author explorer_3039
 */
public class ItemRecoveryCompass extends StringItemBase {

    public ItemRecoveryCompass() {
        super("minecraft:recovery_compass", "Recovery Compass");
    }
    
    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_0;
    }
}
