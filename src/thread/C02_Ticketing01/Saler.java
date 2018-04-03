package thread.C02_Ticketing01;

public class Saler extends Thread {
    private static int ticketNo = 10;
    private String name;


    private static Object lock = new Object();

    Saler(String name) {
        super();
        this.name = name;
    }

    public void run() {
        int tmp;
        while (true) {
            synchronized (lock) {
                tmp = ticketNo;
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ticketNo--;
            }
            if (tmp > 0) {
                System.out.println(name + " : " + tmp);
            } else {
                System.out.println("票已售罄");
                return;
            }
        }
    }
}
