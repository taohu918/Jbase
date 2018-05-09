package day03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 75, 38, 4, 234, 96, 38};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            for (int ii : arr) {
                System.out.print(ii + ", ");
            }
            System.out.println("");
            /*
            <5, 75, 38, 4, 234, 96, 38>
			{5, 38, 4, 75, 96, 38, 234}
			{5, 4, 38, 75, 38, 96, 234}
			{4, 5, 38, 38, 75, 96, 234}
			{4, 5, 38, 38, 75, 96, 234}
			{4, 5, 38, 38, 75, 96, 234}
			{4, 5, 38, 38, 75, 96, 234}
             */
        }
        for (int ii : arr) {
            System.out.print(ii + " ");
        }
    }
}
