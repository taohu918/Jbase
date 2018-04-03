package thread.C01_KnowThread;

class DemoMth01 implements Runnable {  /* 实现 */
    private Thread t;
    private String threadName;

    DemoMth01(String name) {
        this.threadName = name;
        System.out.println("Creating " + this.threadName);
    }

    public void run() {
        try {
            System.out.println("Thread: " + this.threadName + " is sleeping");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interrupted.");
        }
        System.out.println("Thread " + this.threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + this.threadName);
        if (t == null) {
            t = new Thread(this, this.threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        DemoMth01 R1 = new DemoMth01("R1");
        DemoMth01 R2 = new DemoMth01("R2");

        R1.start();
        R2.start();
    }
}
