package day04;

class Demo4 {
    public static void main(String[] args) {
        //System.out.println(Benz.BRAND);
        //Benz b1 = new Benz();
        //System.out.println(b1.color);

        Benz b = new Benz();
        b.setColor("white");
        System.out.println(b.getColor());
    }
}

class Benz {
    private String color = "black";    //null
    int tires;
    static String BRAND = "BENZ";

    //构造代码块
    {
        //System.out.println(color);
    }

    //静态方法,只能访问静态成员
    public static void outBrand() {
//        System.out.println(this.tires);
    }

    public Benz() {
        System.out.println("Benz()");
    }

    public Benz(String color) {
        this();
        this.color = color;
    }

    public Benz(String color, int tires) {
        this(color);
        this.tires = tires;
    }

    public String getColor() {
        System.out.println(BRAND);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
