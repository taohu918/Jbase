package day06;

class PolyDemo1 {
    public static void main(String[] args) {
        //
        DogP1 d1 = new DogP1();
        d1.watch();

        AnimalP1 a1 = d1;
        a1.cry();

//        Eatable e1 = d1;
//        e1.eat();

        AnimalP1 a2 = new DogP1();
        DogP1 d2 = (DogP1) a2;

        //Cat c1 = (Cat)a2;

        //Animal d2 = new Dog();
        //d2.cry();

        //Object o1 = new Dog();
        //o1.cry();
    }
}

class AnimalP1 {
    void cry() {
    }
}

interface EatableP1 {
    public void eat();
}

class DogP1 extends AnimalP1 implements EatableP1 {
    public void cry() {
        System.out.println("wwww");
    }

    public void watch() {
        System.out.println("看家!");
    }

    public void eat() {
        System.out.println("eat...");
    }
}

class Cat extends AnimalP1 {
}
