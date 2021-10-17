import java.util.Arrays;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        boolean bigThen1 = humanYears > 1;
        boolean bigThen2 = humanYears > 2;
        int cat = 15 + (bigThen1 ? 9 : 0) + (bigThen2 ? (humanYears - 2) * 4 : 0);
        int dog = 15 + (bigThen1 ? 9 : 0) + (bigThen2 ? (humanYears - 2) * 5 : 0);
        return new int[]{humanYears, cat, dog};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }
}

