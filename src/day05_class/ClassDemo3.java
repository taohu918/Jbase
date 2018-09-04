package day05_class;

class ClassDemo3 {
    //static Jing8 d = new Jing8();
    public static void main(String[] args) {
        Jin803 d = new Jin803();
//		d.blood = "B";
        d.run();
    }
}

class Animal03 {
    String category;

    public Animal03(String c) {
        System.out.println("new Animal03()");
    }

    public final void run() {
        System.out.println("run...");
    }
}

class Dog03 extends Animal03 {
    String color;

    public Dog03() {
        super("kkk");
        System.out.println("new Dog03()");
    }
}

final class Jin803 extends Dog03 {

    final String blood = "A";//

    public Jin803() {
        super();
        System.out.println("new Jing8()");
    }
}

