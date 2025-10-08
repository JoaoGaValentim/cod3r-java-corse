package session.seven;

public class Average {
    private double total;
    private int quantity;

    public Average() {
        this(0, 0);
    }

    public Average(double total, int quantity) {
        this.total = total;
        this.quantity = quantity;
    }

    public Average add(double value) {
        total += value;
        quantity++;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    static Average combine(Average fAverage, Average lAverage) {
        Average resultAverage = new Average();
        resultAverage.total += fAverage.getTotal() + lAverage.getTotal();
        resultAverage.quantity += fAverage.getQuantity() + lAverage.getQuantity();
        return resultAverage;
    }
}
