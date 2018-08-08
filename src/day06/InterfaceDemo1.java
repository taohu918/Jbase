package day06;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        WomenStar ws = new WomenStar();
        ws.white();
        ws.rich();

        TuHao tuhao = new TuHao();
        tuhao.marry(ws);

        // KoreanMan m1 = new KoreanMan();
        // tuhao.marry(m1);
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
}

class KoreanMan implements White, Rich {
    public void white() {
        System.out.println("白面小生");
    }

    public void rich() {
    }
}

class TuHao {
    //white是接口
    public void marry(WomenStar wrb) {
        wrb.white();
        wrb.rich();
        wrb.beauty();
    }
}