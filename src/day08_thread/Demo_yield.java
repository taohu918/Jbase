package com.thread.demo;

class DemoYield {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();
    }
}

//线程1
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (; ; ) {
            System.out.println(name);
            //yield，放弃,谦让。
            Thread.yield();
        }
    }
}
