package thread.C01_KnowThread;

public class PlayerMain {

    public static void main(String[] args) throws Exception {
        Player p1 = new Player("a", 3);
        Player p2 = new Player("b", 1);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println("人齐，开局!!");
    }
}
