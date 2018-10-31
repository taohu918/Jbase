package com.thread.pcm;

public class Demo_PC_Model_wait {
    public static void main(String[] args) {
        //使用java中集合类，List是列表。
        Pool pool = new Pool();

        Productor p1 = new Productor("生产者1", pool);
        Productor p2 = new Productor("生产者2", pool);
        Productor p3 = new Productor("生产者3", pool);

        Consumer c1 = new Consumer("消费者1", pool);
        Consumer c2 = new Consumer("消费者2", pool);
        Consumer c3 = new Consumer("消费者3", pool);

        p1.start();
        p2.start();
        p3.start();

        c1.start();
        // c2.start();
        // c3.start();
    }
}

class Productor extends Thread {
    static int i = 0;
    private String name;
    private Pool pool;

    public Productor(String name, Pool pool) {
        this.name = name;
        this.pool = pool;
    }

    public void run() {
        //int i = 0 ;
        while (true) {
            pool.add(i++);
            try {
                //Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("add: " + i + " ");
        }
    }
}

class Consumer extends Thread {
    private String name;
    private Pool pool;

    public Consumer(String name, Pool pool) {
        this.name = name;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            int i = pool.remove();
            try {
                //Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("remove: " + i);
        }
    }
}

class Pool {
    private java.util.List<Integer> list = new java.util.ArrayList<Integer>();
    //容器最大值
    private int MAX = 1;

    //添加元素
    public void add(int n) {
        synchronized (this) {
            try {
                while (list.size() > MAX) {
                    this.wait();
                }
                list.add(n);
                System.out.println("size : " + list.size());
                this.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //删除元素
    public int remove() {
        synchronized (this) {
            try {
                while (list.size() == 0) {
                    this.wait();
                }
                int i = list.remove(0);
                this.notify();
                return i;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
    }
}