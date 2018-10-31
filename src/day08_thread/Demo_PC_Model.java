package day08_thread;

public class Demo_PC_Model {
    public static void main(String[] args) {
        //使用java中集合类，List是列表。
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        Productor p = new Productor("生产者", list);
        Consumer c = new Consumer("消费者", list);
        p.start();
        c.start();
    }
}

//生产者
class Productor extends Thread {
    private String name;
    private java.util.List<Integer> list;

    public Productor(String name, java.util.List<Integer> list) {
        this.name = name;
        this.list = list;
    }

    public void run() {
        int i = 0;
        while (true) {
            list.add(new Integer(i++));

            System.out.println("add: " + i + " ");
        }
    }
}

//消费者
class Consumer extends Thread {
    private String name;
    private java.util.List<Integer> list;

    public Consumer(String name, java.util.List<Integer> list) {
        this.name = name;
        this.list = list;
    }

    public void run() {
        while (true) {
            if (list.size() > 0) {
                int i = list.remove(0);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                System.out.println("remove : " + i + " ");
            }
        }
    }
}