package day05;

class ClassDemo2 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.eat();
        s1.run();
        s1.setAsset(1000);
        System.out.println(s1.getAsset());
    }
}

class Father {
    String name;
    private int asset;    //

    private void eat() {
        System.out.println("洗手!");
    }

    public int getAsset() {
        return this.asset;
    }

    public void setAsset(int asset) {
        this.asset = asset;
    }

    void walk() {
        System.out.println("walk...");
    }
}

class Son extends Father {
    public void eat() {
//		super.eat();
        System.out.println("洗澡!");
    }

    public void run() {
        super.walk();
    }

    //
    public void walk() {
    }
}
