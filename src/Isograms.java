public class Isograms {
    public static boolean  isIsogram(String str) {
       int[] arr=new int[128];
       str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
            if(arr[str.charAt(i)]>1)return false;
        }
        return true;
    }
}
