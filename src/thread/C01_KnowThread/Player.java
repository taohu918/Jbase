package thread.C01_KnowThread;

public class Player extends Thread {
    private String name;
    private int sleep;

    Player(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    public void run() {
        System.out.println(this.name + " : 出发了");

        try {
            Thread.sleep((long) (sleep * 1000));
            System.out.println(this.name + " : 到了 , 耗时 : " + this.sleep * 1000);
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}
