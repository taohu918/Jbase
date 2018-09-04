class Demo4 {
    public static void main(String[] args) {
        //System.out.println(Benz.BRAND);
        //Benz b1 = new Benz();
        //System.out.println(b1.color);

        Benz b = new Benz();
        b.setColor("white");
        System.out.println(b.getColor());

        Benz b3 = new Benz();
        System.out.println(b3.getColor());
        b3.outBrand(); /* Benz.outBrand(); */
    }
}

class Benz {
    private String color = "black";    //null
    private int tires;
    static String BRAND = "BENZ";

    {
        System.out.println("\n构造代码块");
        System.out.println(color);
        Benz.outBrand();
    }

    //静态方法,只能访问静态成员
    static void outBrand() {
        System.out.println("\n静态方法");
        System.out.println(Benz.BRAND);
    }

    public Benz() {
        System.out.println("\n构造函数: Benz()");
    }

    public Benz(String color) {
        this(); // 重用第一个构造函数
        System.out.println("\n构造函数: Benz(String color)");
        this.color = color;
    }

    public Benz(String color, int tires) {
        this(color);
        System.out.println("\n构造函数: Benz(String color, int tires)");
        this.tires = tires;
    }

    public String getColor() {
        System.out.println("\n获取颜色");
        System.out.println(BRAND);
        System.out.println(Benz.BRAND);
        System.out.println(this.BRAND);
        return color;
    }

    public void setColor(String c) {
        System.out.println("\n设置颜色");
        color = c;
    }

//    public void setColor(String color) {
//        color = color;
//        this.color = color;
//    }
}
