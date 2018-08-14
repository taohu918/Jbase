package day06;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        TaiDi t = new TaiDi();
        t.cry();
        // t.chun();
        // t.eat();

        DogLover a = new DogLover();
        a.feed(t);

        Eater e = new Eater();
        e.eating(t);
    }
}

interface Pet {
    public void cute();
}

class DogLover {
    public void feed(Pet p) {
        System.out.println("爱狗人士");
        p.cute();
    }
}

interface Eatable {
    public void eat();
}

class Eater {
    public void eating(Eatable e) {
        System.out.println("吃狗肉的");
        e.eat();
    }
}

abstract class Animal {
    abstract String cry();
}

class Dog extends Animal {
    String cry() {
        System.out.println("汪汪..");
        return "abc";
    }
}

class TaiDi extends Dog implements Pet, Eatable {
    public void cute() {
        System.out.println("蠢萌");
    }

    public void eat() {
        System.out.println("好吃");
    }
}