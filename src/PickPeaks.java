import java.lang.reflect.Array;
import java.util.*;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        System.out.println(Arrays.toString(arr));

        LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> peaks = new ArrayList<>();
        int pre=0,cur=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[cur]){
                pre=cur;
                cur=i;
            }else if(arr[i]<arr[cur]) {
                if(arr[pre]<arr[cur]){
                    add(pos,peaks,cur,arr,cur);
                }
                pre=cur;
                cur=i;
            }
        }

        map.put("pos", pos);
        map.put("peaks", peaks);
        return map;
    }

    public static void add(ArrayList<Integer> pos, ArrayList<Integer> peaks, int i, int[] arr, int at) {
        pos.add(i);
        peaks.add(arr[at]);
    }


    public static void main(String[] args) {
//        System.out.println(getPeaks(new int[]{2, 1, 3, 2, 2, 2, 2, 5, 6}));
        System.out.println(getPeaks(new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1}));
//        System.out.println(getPeaks(new int[]{1, 2, 5, 4, 3, 2, 3, 6, 4, 1, 2, 3, 3, 4, 5, 3, 2, 1, 2, 3, 5, 5, 4, 3}));
//        System.out.println(getPeaks(new int[]{2, 16, -4, -5, -1, 9}));
//        System.out.println(getPeaks(new int[]{14, 2, 0, 19, -4, 4, 8, 3, 14, -4, 0, 15, 14}));
//        System.out.println(getPeaks(new int[]{16, -2, -3, 2, 11}));
//        System.out.println(getPeaks(new int[]{1, -4, 1, 14, -4, -2, -2, 10, 18, -1, 0, 13, 5, 4, 16, -4, 11, -5, 1, 14, 14, 13}));
//        System.out.println(getPeaks(new int[]{-4, -1, -4, -3, 4, 14, -1, 12, 0, 16, -3, 19, 6, -4, 18}));
    }
}
