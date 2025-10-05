package session.five.encapsulate;

public class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        people.setName("João");
        // people.age = -30; <= expondo as tripas do objeto
        people.setAge(121); // invalid
        people.setAge(12); // valid (0 <= age <= 120)
        System.out.println(people);
        System.out.println(people.getAge());
    }
}
