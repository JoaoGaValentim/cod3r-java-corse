package session.five.encapsulate;

public class People {
    private String name;
    private int age;

    public People() {

    }

    @Override
    public String toString() {
        return name;
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
}
