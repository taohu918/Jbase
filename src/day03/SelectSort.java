package day03;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 75, 4, 234, 96, 38};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(i);

        }
        // 增强for循环
        for (int x : arr) {
            System.out.println("" + x);
        }
    }
}
