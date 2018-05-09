package thread.z_Bread;

/*
* 30 个面包
* 9 个员工
* 每个员工最少吃一个，最多吃4个。
* */


class BreadPool {
    private int MAX;
    private int Consumer;

    BreadPool(int MAX, int Consumer) {
        super();
        this.MAX = MAX;
        this.Consumer = Consumer;
    }

    synchronized int allocateBread() {
        int Breads = MAX - Consumer;
        MAX--;
        if (Breads > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
