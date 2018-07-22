package day04;

class Demo5 {
    public static void main(String[] args) {
        Dog05 d = new Dog05();
        d.color = "yellow";
        System.out.println(d.color);

        Jing8 dd = new Jing8();
        System.out.println(dd.color);
        dd.bar();

    }
}

//父类,超类
class Animal {
    String color;
    int height;

    public Animal(String color) {
        this.color = color;
    }

    public void bar() {
        System.out.println("汪汪汪~~~");
    }
}

//子类
//class Cat extends Animal{
//	String name ;
//}

/**
 * 继承,extends,throw throws
 */
class Dog05 extends Animal {
    public Dog05() {
        super("white");
    }

    public void bar() {
        System.out.println("撕块肉!!");
        super.bar();
    }
}

//
class Jing8 extends Dog05 {
    public Jing8() {
        super();
    }

    String owner;
}
