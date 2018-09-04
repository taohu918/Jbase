package day05_类的三要素;

class ClassDemo1 {
    public static void main(String[] args) {
        Car c1 = new Car();     //new 必须跟构造函数
        c1.run();
        System.out.println("--------------------");

        Car c2 = new Car("white");
        c2.run();
//        c1.Car("啥玩意");
        System.out.println("--------------------");

        System.out.println(BMW.getBrand());
    }
}

class Car {
    private String color = "black";
    int tires;

    public Car() {
        System.out.println("new Car01()");
    }

    public Car(String color) {
        this();     //必须作为第一行
        System.out.println("\n构造函数: Car(String color)");
        this.color = color;

    }

//    public Car Car(String color) {
//        this.color = color;
//        Car c = new Car();
//        return c;
//    }

    void run() {
        System.out.println(color + " , run....");
    }
}

//public -- private
class BMW extends Car {
    private static String BRAND = "BMW";

    public static String getBrand() {
        return BRAND;
    }
}
