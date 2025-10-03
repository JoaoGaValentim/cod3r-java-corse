package session.four.collections;

public class User {
    String name;

    User() {
        this(null);
    }

    User(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public String toString() {
        return String.format("User(name=%s)", name);
    }
}
