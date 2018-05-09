package day03;

public class two_dimensional_array {
//    private static int num = 0;

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printArr(arr);
        System.out.println();
        transposed_matrix(arr);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i);
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposed_matrix(int[][] arr) {
        int[][] tma = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    tma[i][j] = arr[i][j];
                } else {
                    tma[i][j] = arr[j][i];
                }
                System.out.print(tma[i][j] + " ");
            }
//            num++;
            System.out.println();
        }
    }
}
