package day06;

class NoneName1 {
    public static void main(String[] args) {
        RichMan rm = new RichMan();
        //匿名内部类对象
        rm.findLover(new W() {
            public void white() {
                System.out.println("white....");
            }
        });
        //rm.findLover(() -> System.out.println("white...."));
    }
}

class RichMan {
    void findLover(W w) {
        w.white();
    }
}

interface W {
    public void white();
}

