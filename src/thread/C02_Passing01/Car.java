package thread.C02_Passing01;

public class Car extends Thread {
    private String name;
    private long time;
    private Cave cave;

    Car(String name, long time, Cave cave) {
        super();
        this.name = name;
        this.time = time;
        this.cave = cave;
    }

    public void run() {
        synchronized (cave) {
            try {
                System.out.println("车 " + name + " 开始通过，需要 " + time + " 微秒");
                Thread.sleep(time);
                System.out.println("车 " + name + " 已通过");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
