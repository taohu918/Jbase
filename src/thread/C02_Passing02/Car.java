package thread.C02_Passing02;


public class Car extends Thread {
    private String name;
    private long time;
    private Cave cave;

    Car(String tname, long time, Cave cave) {
        super();
        this.name = tname;
        this.time = time;
        this.cave = cave;
    }

    String getTname() {
        return name;
    }

    public void setTname(String tname) {
        this.name = tname;
    }

    long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Cave getCave() {
        return cave;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }


    public void run() {
        cave.pass(this);
    }
}
