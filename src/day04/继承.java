class Demo5 {
    public static void main(String[] args) {
        Dog05 d = new Dog05();
        d.color = "yellow";
        System.out.println(d.color);

        Jin8 dd = new Jin8();
        System.out.println(dd.color);
        dd.bar();

    }
}

class Animal {
    String color;

    public Animal(String color) {
        this.color = color;
    }

    void bar() {
        System.out.println("汪汪汪~~~");
    }
}

/**
 * 继承,extends,throw throws
 */
class Dog05 extends Animal {
    public Dog05() {
        super("white");
    }

    public void bar() {
        System.out.println("吃肉");
        super.bar();
    }
}

//
class Jin8 extends Dog05 {
    public Jin8() {
        super();
    }

    String owner;
}
