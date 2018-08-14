package day06;

class PolyDemo1 {
    public static void main(String[] args) {
        //
        DogPoly1 d1 = new DogPoly1();
        d1.watch();

        AnimalPoly1 a1 = d1;
        a1.cry();

//        Eatable e1 = d1;
//        e1.eat();

        AnimalPoly1 a2 = new DogPoly1();
        DogPoly1 d2 = (DogPoly1) a2;

        //Cat c1 = (Cat)a2;

        //Animal d2 = new Dog();
        //d2.cry();

        //Object o1 = new Dog();
        //o1.cry();
    }
}

class AnimalPoly1 {
    void cry() {
    }
}

interface EatablePoly1 {
    public void eat();
}

class DogPoly1 extends AnimalPoly1 implements EatablePoly1 {
    public void cry() {
        System.out.println("犬吠");
    }

    public void watch() {
        System.out.println("看家!");
    }

    public void eat() {
        System.out.println("eat...");
    }
}

class Cat extends AnimalPoly1 {
}
