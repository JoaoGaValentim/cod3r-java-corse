package session.five.polymorphism;

public class People {
    private double weight;

    public People(double weight) {
        setWeight(weight);
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void eat(Food food) {
        this.weight += food.getWeight();
    }
}
