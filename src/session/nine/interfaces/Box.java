package session.nine.interfaces;

import java.util.List;
import java.util.function.Consumer;

abstract public interface Box<T> {
    public abstract void add(T thing);

    public abstract boolean open();

    public abstract int getTotalThings();

    public abstract int get(T t);

    public abstract T getValue(int i);

    public abstract List<T> getAll();

    public abstract T sum();

    default void forEachInBox(Consumer<T> consumer) {
        for (T value : getAll()) {
            consumer.accept(value);
        }
    }
}
