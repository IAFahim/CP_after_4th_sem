import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (current == (sum-arr[i]) / 2) return i;
            current+=arr[i];
        }
        System.out.println(sum);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        System.out.println(findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}));
    }
}
