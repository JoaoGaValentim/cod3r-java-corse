package session.five.encapsulate;

public class People {
    private String name;
    private String lastName;
    private int age;

    public People(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
