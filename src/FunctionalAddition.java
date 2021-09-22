import java.util.function.IntUnaryOperator;

public class FunctionalAddition {
    public static IntUnaryOperator add(int n) {
        return a-> a+n;
    }

    public static void main(String[] args) {
        System.out.println(add(3));
    }
}
