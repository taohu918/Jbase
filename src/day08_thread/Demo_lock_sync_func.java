package com.thread.lock.sync.func;

class DemoLockSyncFunc {
    public static void main(String args[]) {
        TicketPool pool = new TicketPool();
        Seller s1 = new Seller("S-1", pool);
        Seller s2 = new Seller("S-2", pool);
        Seller s3 = new Seller("S-3", pool);
        Seller s4 = new Seller("S-4", pool);

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

class Seller extends Thread {
    private String name;
    private TicketPool pool;

    public Seller(String name, TicketPool pool) {
        this.name = name;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            int t = pool.getTicket();
            if (t == 0) {
                return;
            } else {
                System.out.println(name + " : " + t);
                Thread.yield();
            }
        }
    }

}

class TicketPool {
    private int t = 9;

    public synchronized int getTicket() {
        int temp = t;
        t = t - 1;
        return temp > 0 ? temp : 0;
    }
}
