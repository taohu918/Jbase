package day04;

class Demo2 {
    public static void main(String[] args) {
        RichMan wsc = new RichMan();
        // wsc.money = -10000000 ; // Error:(6, 12) java: money可以在day04.RichMan中访问private
        System.out.println(wsc.getMoney());
        wsc.setMoney(100);
        System.out.println(wsc.getMoney());
    }
}

/**
 * 定义类
 */
class RichMan {
    //无参的构造函数
    public RichMan() {
    }

    private int money = 10000000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int m) {
        if (m > money) {
            money = m;
        }
    }
}
