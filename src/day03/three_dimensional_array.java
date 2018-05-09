package day03;

public class three_dimensional_array {
    public static void main(String[] args) {
        String[][][] arr = new String[][][]{
                {{"00a", "00b", "00c"}, {"01a", "01b", "01c"}, {"02a", "02b", "02c"}},
                {{"10a", "10b", "10c"}, {"11a", "11b", "11c"}, {"12a", "12b", "12c"}},
                {{"20a", "20b", "20c"}, {"21a", "21b", "21c"}, {"22a", "22b", "22c"}}
        };
        printArr(arr);
    }

    public static void printArr(String[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                    System.out.print(arr[i][j][k] + " ");
            }
            System.out.println();
        }
    }
}
