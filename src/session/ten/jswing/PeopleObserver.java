package session.ten.jswing;

import java.util.List;

@FunctionalInterface
public interface PeopleObserver {
    void refresh(List<People> peoples);
}
