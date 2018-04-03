package thread.C01_KnowThread;

class DemoMth02 extends Thread { /* 继承 */
    private String threadName = "built-in Name";

    DemoMth02(String name) {
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

    public static void main(String[] args) {
        DemoMth02 J1 = new DemoMth02("J1");
        DemoMth02 J2 = new DemoMth02("J2");

        J1.start();
        J2.start();
    }
}
