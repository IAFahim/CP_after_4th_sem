import java.util.function.IntPredicate;

public class EnumerableMagic {
    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;

    public static boolean all(int[] list, IntPredicate predicate){
        for (int j : list) {
            if (!predicate.test(j)) return false;
        }
        return true;
    }
}
