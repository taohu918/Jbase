package thread.z_BeeBear;

public class Bee extends Thread {
    private String name;
    private long time;
    private Basket basker;

    Bee(String BeeName, long time, Basket basket) {
        super();
        this.name = BeeName;
        this.time = time;
        this.basker = basket;
    }

    public void setBeeName(String BeeName) {
        this.name = name;
    }

    String getBeeName() {
        return name;
    }

    public void setTime(long time) {
        this.time = time;
    }

    long getTime() {
        return time;
    }

    public void run() {
        while (true) {
            basker.add(this);
        }
    }
}
