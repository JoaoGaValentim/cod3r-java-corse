package session.ten.jswing;

import java.util.List;

@FunctionalInterface
public interface TableObserver {
    void refresh(List<People> peoples);
}
