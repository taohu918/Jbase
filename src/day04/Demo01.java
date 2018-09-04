//package day04;

class Demo1 {
    public static void main(String[] args) {
        //创建对象
        //局部变量
        Person p = new Person();
        p.height = 180;

        //调用函数的方法
        p.run();
        System.out.println(p.sex);

        //匿名对象-1
        new Person().run();
        //匿名对象-作为参数进行传递
        run0(new Person());
    }

    private static void run0(Person p) {
        p.run();
    }
}

class Person {
    //成员变量===属性(property)===字段(field)
    String sex;
    int age;

    //定义函数
    public void run() {
        sleep();
    }

    public void sleep() {
        System.out.println("zzz~~~~~");
    }

    int height;        //身高
}