package thread.C02_Passing01;

public class Demo {
    public static void main(String[] args) {
        Cave cave = new Cave("不周山涵洞");
        Car car1 = new Car("a", 2000, cave);
        Car car2 = new Car("b", 3000, cave);

//        Cave c = new Cave();
//        c.setDaemon(true);
//        c.start();
        car1.start();
        car2.start();
    }


}
