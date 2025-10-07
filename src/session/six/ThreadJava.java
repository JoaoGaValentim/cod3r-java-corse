package session.six;

public class ThreadJava {
    public static void main(String[] args) {
        Runnable taskOne = new MyThread(0, 10);
        Runnable taskTwo = new MyThread(0, 15);

        var threadOne = new Thread(taskOne);
        var threadTwo = new Thread(taskTwo);

        threadOne.run();
        System.out.println("---- proxima thread -----");
        threadTwo.run();
    }
}
