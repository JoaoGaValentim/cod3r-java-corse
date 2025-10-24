package session.eleven.models.interfaces;

import java.util.List;

import session.eleven.models.People;

@FunctionalInterface
public interface Observer {
    void updateTable(List<People> peoples);
}
