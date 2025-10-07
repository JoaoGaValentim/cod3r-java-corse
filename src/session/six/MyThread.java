package session.six;

public class MyThread implements Runnable {

    private final int min;
    private final int max;

    public MyThread(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = min; i <= max; i++) {
            System.out.println(i == 0 ? (i + 1) * max : i + max);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
