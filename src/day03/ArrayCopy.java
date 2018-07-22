package day03;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr_long = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr_short = new int[]{1, 2, 3};
        intercept(arr_long);
        rewind(arr_short);
    }

    public static void intercept(int[] arr1) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int ii : arr2) {
            System.out.print(ii + " ");
        }
        System.out.println();
    }

    public static void rewind(int[] arr1) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            if (i <= arr1.length - 1) {
                arr2[i] = arr1[i];
            } else {
                arr2[i] = arr1[i - arr1.length];
            }
        }
        for (int ii : arr2) {
            System.out.print(ii + " ");
        }
    }
}
