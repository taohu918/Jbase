package com.thread.demo;

class DemoDaemon {
    public static void main(String[] args) {
        Box no1 = new Box("No1", 3000);
        Box no2 = new Box("No2", 7000);
        Waiter w = new Waiter();

        //设置线程为守护线程
        w.setDaemon(true);

        no1.start();
        no2.start();
        w.start();
    }
}

class Box extends Thread {
    private String no;
    private int time;

    public Box(String no, int time) {
        this.no = no;
        this.time = time;
    }

    public void run() {
        System.out.println(no + "号包房开始消费!");
        try {
            Thread.sleep(time);
        } catch (Exception ignore) {
        }
        System.out.println(no + " 号包房消费时间 : " + time + ", 结束消费!");
    }
}

//服务员线程
class Waiter extends Thread {
    public void run() {
        while (true) {
            //打印当前系统时间
            System.out.println(new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (Exception ignore) {
            }
        }
    }
}
