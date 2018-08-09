package day06;

class PolyDemo2{
    public static void main(String[] args){
        Jing8 jing8 = new Jing8();

        jing8.cry();
        System.out.println(jing8.name);

        DogP d1 = jing8 ;
        d1.cry();
        System.out.println(d1.name);
    }
}

abstract class AnimalP2{
    abstract void cry();
}

class DogP extends AnimalP2{
    public String name = "小白";
    public void cry(){
        System.out.println("汪汪...");
    }
}

class Jing8 extends DogP{
    public String name = "大黄";
    public void cry(){
        System.out.println("I'm Jing8,~~~~~,汪汪...");
    }
}

