package session.five.polymorphism;

abstract public class Food {
    protected double weight;

    public Food(double weight) {
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
}
