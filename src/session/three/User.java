package session.three;

public class User {
    String name;
    String email;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return user.name.equals(this.name) && user.email.equals(user.email);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
