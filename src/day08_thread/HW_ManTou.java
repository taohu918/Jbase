package day08_thread;

public class HW_ManTou {
    public static void main(String[] args) {
        //创建篮子
        Basket basket = new Basket();
        for (int i = 1; i <= 40; i++) {
            new Worker("Worker-" + i, basket).start();
        }
    }
}


class Worker extends Thread {
    private String name;
    private Integer MAX = 3;
    private int count;
    private Basket basket;

    public Worker(String name, Basket basket) {
        this.name = name;
        this.basket = basket;
    }

    public void run() {
        while (true) {
            // 1.判断是否已经吃饱了
            if (count >= MAX) {
                return;
            }
            // 2.去取馒头
            int no = basket.getBread();
            if (no == 0) {
                return;
            }
            //3.拿到了馒头
            count++;
            System.out.println(name + " : " + no);
        }
    }

}

class Basket {
    private int count = 100;

    public synchronized int getBread() {
        int temp = count;
        count--;
        return temp > 0 ? temp : 0;
    }
}