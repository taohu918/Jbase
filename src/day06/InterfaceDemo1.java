package day06;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        WomenStar ws = new WomenStar();
        ws.self();

        TuHao tuhao = new TuHao();
        tuhao.marry(ws);
    }
}

/*
 * 土豪赢取白富美
 * */
class TuHao {
    public void marry(WomenStar wrb) {
        wrb.white();
        wrb.rich();
        wrb.beauty();
    }
}

interface White {
    public void white();
}

interface Rich {
    public void rich();
}

interface Beauty {
    public void beauty();
}

interface WRB extends White, Rich, Beauty {
}

/*
 * 符合白富美条件, 即实现了 WRB 接口的女明星
 * */
class WomenStar implements WRB {
    public void white() {
        System.out.println("很白");
    }

    public void rich() {
        System.out.println("有钱");
    }

    public void beauty() {
        System.out.println("漂亮");
    }

    public void self() {
        System.out.println("我是白富美");
    }
}

