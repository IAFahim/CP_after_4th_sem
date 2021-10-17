import java.lang.reflect.Array;
import java.util.Arrays;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        int[] arr=new int[]{a,b,c};
        Arrays.sort(arr);
        return (arr[0]+arr[1]>arr[2]);
    }
}
