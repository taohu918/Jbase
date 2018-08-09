package day06;

public class PolyDemo3 {
    public static void main(String[] args) {
        Benz b1 = new Benz();
        System.out.println(b1.getColor());

        Car c1 = new Benz();
        System.out.println(c1.getColor());
    }
}


class Car {
    private String color = "无色";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Benz extends Car {
    private String color = "黑色";

    public String getColor() {
//        return color;
        return super.getColor();
    }

    public void setColor(String color) {
//        this.color = color;
        super.setColor(color);
    }
}