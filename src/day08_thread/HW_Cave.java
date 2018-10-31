package day08_thread;

public class HW_Cave {
    public static void main(String args[]) {
        Cave cave = new Cave("不周山");
        Car car1 = new Car("a", 2000, cave);
        Car car2 = new Car("b", 3000, cave);

        car1.start();
        car2.start();
    }
}

class Car extends Thread {
    private String plate;
    private long time;
    private Cave cave;

    public Car(String plate, long time, Cave cave) {
        this.plate = plate;
        this.time = time;
        this.cave = cave;
    }

    public void run() {
        cave.pass();
        System.out.println("车牌为: " + plate + " 的车通过, 用时: " + time + "ms");
    }
}


class Cave {
    private String name;

    public Cave(String name) {
        this.name = name;
    }

    synchronized void pass() {
        System.out.println(name + "涵洞欢迎你.");
    }
}