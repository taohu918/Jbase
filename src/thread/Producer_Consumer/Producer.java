package thread.Producer_Consumer;

public class Producer extends Thread {
    private String pname;
    private Pool pool;

    private static int i = 0;

    Producer(String pname, Pool pool) {
        super();
        this.pname = pname;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            try {
                int tmp = i++;
                pool.add(tmp);
                System.out.println(pname + " added : " + tmp);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("over");
            }
        }
    }
}
