package day04;

class Demo3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        //静态成员.
        System.out.println(Dog.blood);
        /*
		d.setColor("yellow");

		Dog d2 = new Dog("white");
		System.out.println(d2.getColor());

		Dog d3 = new Dog("white","小白");
		System.out.println(d3.getName());
		*/
    }
}

/**
 * 定义类
 */
class Dog {
    //构造代码块
    {
        System.out.println("1.构造代码块");
    }

    //静态成员
    public static String blood = "Jing8";//

    //静态代码块
    static {
        //静态成员只能访问静态成员，无法访问非静态的.
        //
        //color = "yellow" ;
        System.out.println("静态代码块-1");
        System.out.println(blood);
    }


    private String color;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    //空参构造
    public Dog() {
        System.out.println("Dog()");
    }

    public Dog(String c) {
        System.out.println("Dog(String c)");
        color = c;
    }

    //构造函数
    public Dog(String c, String n) {
        color = c;
        name = n;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    //构造代码块
    {
        System.out.println("2.构造代码块");
    }
    //静态代码块
    //static{
    //	System.out.println("静态代码块-2");
    //}
}