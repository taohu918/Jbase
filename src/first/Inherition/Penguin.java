package first.Inherition;

public class Penguin extends Animal {
    Penguin(String myName, int myid) {
        super(myName, myid);
    }

    public void type() {
        System.out.println("This is Penguin");
    }

    public void typetest() {
        this.type();     // this 调用自己的方法
        super.type();    // super 调用父类方法
    }

    public static void main(String args[]) {
        Penguin P1 = new Penguin("doudou", 1);
        P1.introduction();

        Animal A1 = new Animal("x", 0);
        A1.type();

        P1.typetest();
    }
}
