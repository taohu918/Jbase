package com.thread.lock2;

class DemoLock2 {
    public static void main(String[] args) {
        Object lock = new Object();
        Seler s1 = new Seler("S1", lock);
        Seler s2 = new Seler("S2", lock);
        s1.start();
        s2.start();
    }
}

//售票员
class Seler extends Thread {
    private static int tickets = 100;
    private final Object lock;  // 锁旗标
    private String name;

    Seler(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            int t = getTicket();
            if (t == -1) {
                return;
            } else {
                System.out.println(name + " :: " + t);
            }
        }
    }

    //取票
    private int getTicket() {
        synchronized (lock) {
            int t = tickets;
            try {
                //Thread.sleep(50);
            } catch (Exception ignore) {
                System.out.println();
            }
            tickets = tickets - 1;
            return t < 1 ? -1 : t;
        }
    }
}
