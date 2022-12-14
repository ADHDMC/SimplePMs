package adhdmc.simplepms.utils;

import adhdmc.simplepms.SimplePMs;
import org.bukkit.NamespacedKey;

public enum SPMKey {
    IGNORE_LIST(new NamespacedKey(SimplePMs.getInstance(), "ignore-list")),
    SPY_TOGGLE(new NamespacedKey(SimplePMs.getInstance(), "spy-toggle")),
    LAST_MESSAGED(new NamespacedKey(SimplePMs.getInstance(), "last-messaged"));

    final NamespacedKey key;


    SPMKey(NamespacedKey key) {
        this.key = key;
    }

    public NamespacedKey getKey() {
        return key;
    }
}
