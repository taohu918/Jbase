package com.thread.cave2;

public class HW_Cave_new {
    public static void main(String[] args) {
        Cave cave = new Cave("不周山隧道");
        Car car1 = new Car("a", 2000, cave);
        Car car2 = new Car("b", 1000, cave);

        car1.start();
        car2.start();
    }
}

class Car extends Thread {
    private String number;
    private long time;
    private Cave cave;

    Car(String number, long time, Cave cave) {
        this.number = number;
        this.time = time;
        this.cave = cave;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

class Cave extends Thread {
    private String name;

    Cave(String name) {
        this.name = name;
    }

    synchronized void pass(Car c) {
        System.out.println(c.getNumber() + "正在通过 " + name);
        try {
            Thread.sleep(c.getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.getNumber() + "已通过!  耗时: " + c.getTime() + "毫秒");
    }
}
