package thread.Producer_Consumer;

public class PCDemo {
    public static void main(String[] args) {
        Pool pool = new Pool();
        Producer p1 = new Producer("p1", pool);
        Consumer c1 = new Consumer("c1", pool);
        Consumer c2 = new Consumer("c2", pool);

        p1.start();
        c1.start();
        c2.start();
    }
}
