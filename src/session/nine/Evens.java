package session.nine;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Evens<K extends Number, V> {
    private final Set<Even<K, V>> items = new LinkedHashSet<>();

    public void add(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key don't allow null");
        }

        var even = new Even<K, V>(k, v);

        if (items.contains(even)) {
            items.remove(even);
        }

        items.add(even);
    }

    public V getValue(K key) {
        if (key == null) {
            throw new NullPointerException("key don't allow null");
        }

        Optional<Even<K, V>> evenOptional = items.stream().filter(e -> key.equals(e.getKey()))
                .findFirst();
        return evenOptional.isPresent() ? evenOptional.get().getValue() : null;
    }

}
