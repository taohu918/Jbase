package day06;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        TaiDi t = new TaiDi();
        t.cry();

        DogLover a = new DogLover();
        a.feed(t);

        Businessman b = new Businessman();
        b.sell(t);
    }
}


class DogLover {
    public void feed(Pet p) {
        System.out.println("爱狗人士");
        p.cute();
    }
}

interface Pet {
    public void cute();
}

class Businessman {
    public void sell(Valuable v) {
        System.out.println("卖狗的");
        v.price();
    }
}

interface Valuable {
    public void price();
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

class TaiDi extends Dog implements Pet, Valuable {
    public void cute() {
        System.out.println("蠢萌");
    }

    public void price() {
        System.out.println("500RMB");
    }
}