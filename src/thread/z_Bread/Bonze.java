package thread.z_Bread;

public class Bonze extends Thread {
    private String name;
    private BreadPool bp;
    private int eatLimit;

    Bonze(String name, BreadPool bp, int eatLimit) {
        super();
        this.name = name;
        this.bp = bp;
        this.eatLimit = eatLimit;
    }

    public void run() {
        int has_ate = 1;
        while (has_ate < eatLimit) {
            int bread = bp.allocateBread();
            if (bread != 0) {
                has_ate += 1;
                if (has_ate >= eatLimit) {
                    System.out.println(name + " 已经吃了" + has_ate + "个面包了, 不能再吃了");
                    break;
                }
            } else {
                System.out.println("面包吃完了, " + name + " 一共吃了" + has_ate);
                break;
            }
        }
    }
}
