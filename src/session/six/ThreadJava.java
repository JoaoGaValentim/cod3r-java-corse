package session.six;

public class ThreadJava {
    public static void main(String[] args) {
        Runnable taskOne = new MyThread(0, 10);
        Runnable taskTwo = new MyThread(0, 15);

        var threadOne = new Thread(taskOne);
        var threadTwo = new Thread(taskTwo);

        Runnable threadThree = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        threadOne.run();
        System.out.println(" --- A ---");
        threadTwo.run();
        System.out.println(" --- B ---");
        threadThree.run();
    }
}
