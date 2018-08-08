package day05;

class AbstractClassDemo1 {
    public static void main(String[] args) {
        //不能实例化Animal
        //Animal a = new Animal();

        Dog01 d = new Dog01();
        d.cry();

        Cat02 c = new Cat02();
        c.cry();

    }
}

abstract class Animal01 {
    public Animal01() {
        System.out.println("new Animal()");
    }

    public Animal01(String name) {
        System.out.println("new Animal()");
    }

    //抽象方法
    public void cry() {
    }
}

class Dog01 extends Animal01 {

    //实现抽象方法
    public void cry() {
        System.out.println("汪汪...");
    }
}

class Cat02 extends Animal01 {
    //实现抽象方法
    public void cry() {
        System.out.println("喵喵...");
    }
}