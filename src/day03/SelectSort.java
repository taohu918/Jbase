package day03;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 75, 38, 4, 234, 96, 38};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            for (int x : arr) {
                System.out.print(x + ", ");
            }
            System.out.println();
            /*
            <5, 75, 38, 4, 234, 96, 38>
            {4, 75, 38, 5, 234, 96, 38}
            {4, 5, 75, 38, 234, 96, 38}
            {4, 5, 38, 75, 234, 96, 38}
            {4, 5, 38, 38, 234, 96, 75}
            {4, 5, 38, 38, 75, 234, 96}
            {4, 5, 38, 38, 75, 96, 234}
             */

        }
        // 增强for循环
        for (int x : arr) {
            System.out.print(x + ", ");
        }
    }
}
