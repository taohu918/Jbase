//package day04;

class Demo2 {
    public static void main(String[] args) {
        RichMan wsc = new RichMan();
        System.out.println(wsc.getMoney());
        wsc.setMoney(100);
        System.out.println(wsc.getMoney());
    }
}

class RichMan {
    //无参的构造函数
    public RichMan() {
    }

    private int money = 10000000;

    int getMoney() {
        return money;
    }

    void setMoney(int m) {
        if (m > money) {
            money = m;
        }
    }
}
