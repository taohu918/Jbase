package thread.C05_KnowDeamon;

public class Customer extends Thread {
    public void run() {
        try {
            System.out.println("开始消费");
            Thread.sleep(5000);
            System.out.println("买单!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
