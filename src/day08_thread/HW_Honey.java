package day08_thread;

public class HW_Honey {
    public static void main(String[] args) {
        Box box = new Box();
        for (int i = 1; i <= 50; i++) {
            new Bee("Bee-" + i, box).start();
        }

        new Bear("x1", box).start();
        new Bear("x2", box).start();
    }
}


class Bee extends Thread {
    private String name;
    private Box box;

    public Bee(String name, Box box) {
        this.name = name;
        this.box = box;
    }

    public void run() {
        while (true) {
            int n = box.add();
            System.out.println(name + "生产了蜂蜜:1,box : " + n);
        }
    }
}

class Bear extends Thread {
    private String name;
    private Box box;

    public Bear(String name, Box box) {
        this.name = name;
        this.box = box;
    }

    public void run() {
        while (true) {
            box.del();
            System.out.println(name + "吃掉了蜂蜜:20!");
        }
    }
}

class Box {
    private int Max = 20;
    private int count;

    public synchronized int add() {
        while (count >= Max) {
            try {
                this.notify();
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ++count;
    }

    public synchronized void del() {
        while (count < Max) {
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        count = 0;
        this.notify();
    }
}