package day02;

class TriangleDemo1 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        //行循环
        while (i <= n) {
            //输出整个一行
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}