import java.util.*;
import java.util.stream.LongStream;

public class IntegersRecreationOne {

    public static String listSquared(long m, long n) {
        ArrayList<Long[]> arr = new ArrayList<>();
        for (long i = m; i < n; i++) {
            long finalI = i;
            long sum= LongStream.rangeClosed(1, i).filter(x -> finalI % x == 0).map(x->x*x).sum();
            if(isPowerOf(sum)){
                arr.add(new Long[]{i,sum});
            }
        }
        return Arrays.deepToString(arr.toArray());
    }

    public static boolean isPowerOf(long x) {
        long sqrt = (long) Math.sqrt(x);
        long pow = (long) (sqrt * sqrt);
        return x == pow;
    }

    public static void main(String[] args) {
        System.out.println(listSquared(1, 250));
    }
}
