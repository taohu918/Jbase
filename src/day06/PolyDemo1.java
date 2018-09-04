package day06;

class PolyDemo1 {
    public static void main(String[] args) {
        //
        DogPoly1 d1 = new DogPoly1();
        d1.bark();

        AnimalPoly1 a1 = d1;
        a1.cute();

        // System.out.println("\n-----------");
        // WatchDog w1 = d1;
        // ((DogPoly1) w1).cute();

        System.out.println("\n-----------");
        AnimalPoly1 a2 = new DogPoly1();
        DogPoly1 d2 = (DogPoly1) a2;
        d2.cute();

        //Cat c1 = (Cat)a2;

        //Animal d2 = new Dog();
        //d2.cry();

        //Object o1 = new Dog();
        //o1.cry();
    }
}

class AnimalPoly1 {
    void cute() {
    }
}

interface WatchDog {
    public void bark();
}

class DogPoly1 extends AnimalPoly1 implements WatchDog {
    public void bark() {
        System.out.println("看家");
    }

    public void cute() {
        System.out.println("卖萌");
    }

}

class Cat extends AnimalPoly1 {
}
