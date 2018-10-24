package com.thread.lock.sync.stc;


class DemoLockSyncFuncStatic {
    public static void main(String[] args){
        Seller s1 = new Seller("S-1");
        Seller s2 = new Seller("S-2");
        Seller s3 = new Seller("S-3");
        Seller s4 = new Seller("S-4");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}


class Seller extends Thread {
    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public void run() {
        while (true) {
            int t = ThreadPool.getTicket();
            if (t == 0) {
                return;
            } else {
                System.out.println(name + " : " + t);
                Thread.yield();
            }
        }
    }
}

class ThreadPool {
    private static int t = 9;

    // 同步代码块,以票池本身作为锁旗标
    public synchronized static int getTicket() {
        int temp = t;
        t = t - 1;
        return temp > 0 ? temp : 0;
    }
}