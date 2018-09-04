package day02;

/**
 * switch分支语句
 */
class SwitchDemo2 {
    public static void main(String[] args) {
        int a = 11;
        if (a < 1 || a > 12) {
            System.out.println("非法月份");
            return;
            //System.out.println("非法月份");//unreachable
        }

        int season = (a - 1) / 3;
        switch (season) {
            //多个条件进行罗列
            case 0:
                System.out.println("春");
                break;
            case 1:
                System.out.println("夏");
                break;
            case 2:
                System.out.println("秋");
                break;
            default:
                System.out.println("冬");
                break;
        }

    }
}