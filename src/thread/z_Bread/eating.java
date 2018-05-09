package thread.z_Bread;

public class eating {
    public static void main(String args[]) {
        BreadPool bp = new BreadPool(100, 9);

        Bonze b1 = new Bonze("b1", bp, 12);
        Bonze b2 = new Bonze("b2", bp, 12);
        Bonze b3 = new Bonze("b3", bp, 12);
        Bonze b4 = new Bonze("b4", bp, 12);
        Bonze b5 = new Bonze("b5", bp, 12);
        Bonze b6 = new Bonze("b6", bp, 12);
        Bonze b7 = new Bonze("b7", bp, 12);
        Bonze b8 = new Bonze("b8", bp, 12);
        Bonze b9 = new Bonze("b9", bp, 12);

        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
        b6.start();
        b7.start();
        b8.start();
        b9.start();
    }
}
