package day03;

public class HalfFind {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 9, 38, 75, 96, 234};
        int min = 0;
        int max = arr.length - 1;
        int num = 5;
        while (min <= max) {
            int half = (min + max) / 2; // 中间元素的下标
            if (arr[half] == num) {
                System.out.println("" + half);
                break;
            }
            if (arr[half] > num) {
                max = half - 1;
            } else {
                min = half + 1;
            }
        }
    }
}
