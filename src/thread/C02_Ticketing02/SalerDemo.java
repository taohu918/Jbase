package thread.C02_Ticketing02;

public class SalerDemo {
    public static void main(String[] args) {
        TicketPool pool = new TicketPool();

        Saler s1 = new Saler("a", pool);
        Saler s2 = new Saler("b", pool);

        s1.start();
        s2.start();
    }
}
