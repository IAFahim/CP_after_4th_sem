import java.util.Arrays;

public class Greed {
    private static final int[] tuple = {0, 1000, 200, 300, 400, 500, 600};
    private static final int[] single = {0, 100, 0, 0, 0, 50, 0};

    public static int greedy(int[] dice) {
//        Three 1's => 1000 points
//        Three 6's =>  600 points
//        Three 5's =>  500 points
//        Three 4's =>  400 points
//        Three 3's =>  300 points
//        Three 2's =>  200 points
//        One   1   =>  100 points
//        One   5   =>   50 point
        System.out.println(Arrays.toString(dice));
        int[] store = new int[7];
        for (int i = 0; i < dice.length; i++) {
            store[dice[i]]++;
        }
        int sum = 0;
        for (int i = 1; i < store.length; i++) {
            sum += (store[i] / 3) * tuple[i] + (store[i] % 3) * single[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Greed.greedy(new int[]{1, 1, 4, 1, 6}));
        System.out.println(Greed.greedy(new int[]{6, 6, 6, 6, 1}));
    }
}