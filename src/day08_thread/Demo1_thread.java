package day08_thread;

class Demo1 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread();
        YourThread t2 = new YourThread();

        t1.start();
        t2.start();
    }
}

//线程1
class MyThread extends Thread {
    public void run() {
        for (; ; ) {
            System.out.println("hello world - 1");
        }
    }
}

//
class YourThread extends Thread {
    public void run() {
        for (; ; ) {
            System.out.println("hello world - 2");
        }
    }
}