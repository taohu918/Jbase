package day02;

/**
 * switch分支语句
 */
class SwitchDemo1 {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            //多个条件进行罗列
            case 1:
            case 2:
            case 3:
                System.out.println("small");
                //中断switch语句
                break;
            case 4:
                System.out.println("middle");
                //break ;
            case 5:
                System.out.println("big");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}