package thread.C05_KnowDeamon;


public class KtvDemo {
    public static void main(String[] args) {
        Customer c = new Customer();
        Waitress w = new Waitress();

        //设置线程为守护线程
        w.setDaemon(true);
        w.start();
        c.start();
    }
}
