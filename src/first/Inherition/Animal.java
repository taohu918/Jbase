package first.Inherition;

public class Animal {
    private String name;
    private int id;

    Animal(String myName, int myid) {
        //初始化属性值
        name = myName;
        id = myid;
    }

    public void eat() {
        //吃东西方法的具体实现
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        //睡觉方法的具体实现
        System.out.println(name + "正在睡");
    }

    public void type() {
        System.out.println("This is Animal");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
