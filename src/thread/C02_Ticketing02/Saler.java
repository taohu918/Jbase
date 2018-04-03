package thread.C02_Ticketing02;

public class Saler extends Thread {
    private String name;
    private TicketPool pool;

    /* 构造方法的名称必须与类同名，一个类可以有多个构造方法。*/
    Saler(String name, TicketPool pool) {
        super();
        this.name = name;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            int tick = pool.getTick();
            if (tick != 0) {
                System.out.println(name + " : " + tick);
            } else {
                System.out.println("票已售罄");
                break;
            }
            yield();
        }
    }
}
