package thread.Producer_Consumer;

public class Consumer extends Thread {
    private String cname;
    private Pool pool;

    Consumer(String cname, Pool pool) {
        super();
        this.cname = cname;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            try {
                int i = pool.removeFirst();
                System.out.println(cname + " removed : " + i);
                Thread.sleep(200);
                if (i != -1) {
                    System.out.println(cname + " removed : " + i);
                }
            } catch (InterruptedException e) {
                System.out.println("over");
            }
        }
    }
}
