package com.thread.demo;

class DemoJoin {
    public static void main(String[] args) {
        Player p1 = new Player("老大", 3000);
        Player p2 = new Player("老二", 1000);
        Player p3 = new Player("老三", 2000);
        Player p4 = new Player("老四", 2500);

        //
        p1.start();
        p2.start();
        p3.start();
        p4.start();

        try {
            p1.join();
            p2.join();
            p3.join();
            p4.join();
        } catch (Exception ignore) {
        }
        System.out.println("开局!");
    }
}

class Player extends Thread {
    private String name;
    private int time;

    Player(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        System.out.println(name + " 出发了!");
        try {
            Thread.sleep(time);
        } catch (Exception ignored) {
        }
        System.out.println(name + " 到场了. 耗时 : " + time);
    }
}
