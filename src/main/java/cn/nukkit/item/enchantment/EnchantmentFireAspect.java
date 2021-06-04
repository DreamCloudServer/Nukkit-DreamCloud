package cn.nukkit.item.enchantment;

import cn.nukkit.Server;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityCombustByEntityEvent;

/**
 * @author MagicDroidX
 * Nukkit Project
 */
public class EnchantmentFireAspect extends Enchantment {

    protected EnchantmentFireAspect() {
        super(ID_FIRE_ASPECT, "fire", Rarity.RARE, EnchantmentType.SWORD);
    }

    @Override
    public int getMinEnchantAbility(int level) {
        return 10 + (level - 1) * 20;
    }

    @Override
    public int getMaxEnchantAbility(int level) {
        return super.getMinEnchantAbility(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void doAttack(Entity attacker, Entity entity) {
        int duration = Math.max(entity.fireTicks / 20, getLevel() << 2);

        EntityCombustByEntityEvent ev = new EntityCombustByEntityEvent(attacker, entity, duration);
        Server.getInstance().getPluginManager().callEvent(ev);

        if (!ev.isCancelled()) {
            entity.setOnFire(ev.getDuration());
        }
    }
}
