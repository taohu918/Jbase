package day06;

class NoneName2 {
    public static void main(String[] args) {
        Pets pet = new Dogs() {
            public void cute() {
                run();
                System.out.println("cute");
            }

            public void run() {
                System.out.println("跑一圈!!");
            }
        };
        pet.cute();
        //pet.run();
    }
}

//宠物
abstract class Pets {
    abstract public void cute();
}

class Dogs extends Pets {
    public void cute() {
        System.out.println("~~~D~O~G~");
    }
}