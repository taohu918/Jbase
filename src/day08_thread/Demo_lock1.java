package com.thread.lock1;

class DemoLock1 {
    public static void main(String[] args) {
        Seller s1 = new Seller("S1");
        Seller s2 = new Seller("S2");
        s1.start();
        s2.start();
    }
}

//售票员
class Seller extends Thread {
    private static int tickets = 10;
    private static final Object lock = new Object();    // 锁旗标
    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public void run() {
        while (true) {
            int t = getTicket();
            if (t == -1) {
                return;
            } else {
                System.out.println(name + " : " + t);
            }
        }
    }

    //取票
    private int getTicket() {
        synchronized (lock) {
            int t = tickets;
            try {
                Thread.sleep(100);
            } catch (Exception ignore) {
            }

            tickets = tickets - 1;
            return t < 1 ? -1 : t;
        }
    }
}
