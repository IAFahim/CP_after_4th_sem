import java.util.ArrayList;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                arrayList.add(array[i]);
            }
        }
        int[] arr=new int[arrayList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arrayList.get(i);
        }
        return arr;
    }
}
