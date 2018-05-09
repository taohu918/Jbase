package thread.z_BeeBear;

import java.util.LinkedList;
import java.util.List;

class Basket {
    private int MAX;
    private String name;
    private List<Integer> basket = new LinkedList<Integer>();
    private List<Integer> eat = new LinkedList<Integer>();

    Basket(String name, int MAX) {
        super();
        this.name = name;
        this.MAX = MAX;
    }

    synchronized void add(Bee b) {
        try {
            while (basket.size() >= MAX) {
                wait();
            }
            basket.add(1);
            System.out.println(b.getBeeName() + "采来花蜜,放入篮子: " + name);
            System.out.println(basket);
            this.notify();
            Thread.sleep(b.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized List<Integer> removeList(Bear b) {
        try {
            while (basket.size() < 10) {
                wait();
            }
            eat.clear();
            for (int i = 0; i < 10; i++) {
                eat.add(basket.get(i));
            }
            basket.removeAll(eat);
            System.out.println(b.getBearName() + "这个熊吃了蜂蜜from: " + name);
            this.notify();
            return eat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
