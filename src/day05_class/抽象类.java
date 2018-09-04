package day05_class;

class AbstractClassDemo1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.cry();

        Cat c = new Cat();
        c.cry();

    }
}

abstract class Animal {
    public Animal() {
        System.out.println("构造函数: Animal()");
    }

    public Animal(String name) {
        System.out.println("构造函数: Animal(String name)");
    }

    //抽象方法
    public void cry() {
    }
}

class Dog extends Animal {
    //实现抽象方法
    public void cry() {
        System.out.println("汪汪...");
    }
}

class Cat extends Animal {
    //实现抽象方法
    public void cry() {
        System.out.println("喵喵...");
    }
}