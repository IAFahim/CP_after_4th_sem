import java.util.Arrays;

public class FoldAnArray {
    public static int[] foldArray(int[] array, int runs) {
        array=Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length / 2; i++) {
            array[i] += array[array.length - i - 1];
        }
        if(runs!=1)
        return foldArray(Arrays.copyOfRange(array, 0, (array.length+1) / 2), runs-1);
        return Arrays.copyOfRange(array, 0, (array.length+1) / 2 );
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5 };;
        System.out.println(Arrays.toString(foldArray(input, 1)));
        System.out.println(Arrays.toString(foldArray(input, 2)));
        System.out.println(Arrays.toString(foldArray(input, 3)));

    }
}
