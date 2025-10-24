package session.eleven;

public class People {
    private int id;
    private String name;

    public People(int id, String name) {
        setId(id);
        setName(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
