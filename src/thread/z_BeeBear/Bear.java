package thread.z_BeeBear;

import java.util.List;

public class Bear extends Thread {
    private String name;
    private Basket basket;

    Bear(String BearName, Basket basket) {
        super();
        this.name = BearName;
        this.basket = basket;
    }

    public void setBearName(String BearName) {
        this.name = name;
    }

    String getBearName() {
        return name;
    }

    public void run() {
        while (true) {
            try {
                List li = basket.removeList(this);
                Thread.sleep(10);
                System.out.println(name + " eat " + li);
            } catch (InterruptedException e) {
                System.out.println("over");
            }
        }
    }
}
