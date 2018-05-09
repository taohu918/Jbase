package first.AbstractClass;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}

/*
* 抽象类不能被实例化, 如果被实例化就会报错, 编译无法通过. 只有抽象类的非抽象子类可以创建对象
* 抽象类中不一定包含抽象方法, 但是有抽象方法的类必定是抽象类
* 抽象类中的抽象方法只是声明, 不包含方法体, 就是不给出方法的具体实现, 也就是方法的具体功能
* 构造方法、类方法（用static修饰的方法）不能声明为抽象方法
* 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类
* */