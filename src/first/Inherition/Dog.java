package first.Inherition;

public class Dog extends Animal {
    Dog(String myName, int myid) {
        super(myName, myid);
    }

    // 重写(Override)
    public void eat() {
        System.out.println("狗吃了很多");
    }

    public static void main(String args[]) {
        Dog D1 = new Dog("OneDog", 3);
        D1.introduction();

        System.out.println("===============");
        Animal a1 = new Animal("a1", 1);    // Animal 对象
        Animal a2 = new Dog("a2", 2);       // Dog 对象
        a1.eat();   // 执行 Animal 类的方法
        a2.eat();   // 执行 Dog 类的方法
        // a2.eat1();   // 报错, 因为Animal没有eat1方法
    }
}
