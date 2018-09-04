//package day04;

class Demo3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setColor("yellow");
        System.out.println("------------------------\n");

        Dog d2 = new Dog("white");
        System.out.println(d2.getColor());
        System.out.println("------------------------\n");

        Dog d3 = new Dog("white", "小小");
        System.out.print(d3.getName());
        System.out.println("------------------------\n");

        /*
         若前面没有创建 Dog 对象, 直接打印 Dog.blood 亦要处理静态代码块
         */
        System.out.println(Dog.blood); // 打印静态成员.
    }
}

class Dog {
    /* 成员变量 */
    private String color;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    // 构造代码块, 每次创建对象都会执行.
    {
        System.out.println("构造代码块: 01");
    }

    // 静态成员
    public static String blood = "Jin8";

    // 静态代码块
    static {
        //静态成员只能访问静态成员，无法访问非静态的.
        //color = "yellow" ;
        System.out.println("静态代码块: 01");
        System.out.println(blood);  // 静态代码块引用的 静态成员, 需要先定义
    }

    /* 空参数构造函数 */
    public Dog() {
        System.out.println("构造函数: Dog()");
    }

    public Dog(String c) {
        System.out.println("构造函数: Dog(String c)");
        color = c;
    }

    public Dog(String c, String n) {
        System.out.println("构造函数: Dog(String c, String n)");
        color = c;
        name = n;
    }

    String getColor() {
        return color;
    }

    void setColor(String c) {
        color = c;
    }

    // 构造代码块
    {
        System.out.println("构造代码块: 02");
    }
    //静态代码块
    //static{
    //	System.out.println("静态代码块-2");
    //}
}