package thread.C01_KnowThread;

public class MyThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 100; ++i) {
            System.out.println(name + " : " + i);
            yield();
        }
    }
}
