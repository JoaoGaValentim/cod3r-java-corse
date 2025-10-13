package session.nine;

public class Even<K extends Object, V extends Object> {
    private K key;
    private V value;

    public Even(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Even<?, ?> other = (Even<?, ?>) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        return true;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
