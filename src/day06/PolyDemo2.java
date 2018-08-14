package day06;

class PolyDemo2 {
    public static void main(String[] args) {
        Jin8 jin8 = new Jin8();
        jin8.cry();
        System.out.println(jin8.name);

        DogPoly2 d1 = jin8;
        d1.cry();
        System.out.println(d1.name);
    }
}

abstract class AnimalPoly2 {
    abstract void cry();
}

class DogPoly2 extends AnimalPoly2 {
    public String name = "小白";

    public void cry() {
        System.out.println("汪汪...");
    }
}

class Jin8 extends DogPoly2 {
    public String name = "大黄";

    public void cry() {
        System.out.println("I'm Jin8,~~~~~,汪汪...");
    }
}

