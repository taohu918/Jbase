package thread.C02_Ticketing01;

public class SalerDemo {

    public static void main(String[] args) {
        Saler s1 = new Saler("a");
        Saler s2 = new Saler("b");

        s1.start();
        s2.start();
        System.out.println("hello world");
    }
}
