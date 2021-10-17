public class TwoToOne {
    public static String longest(String s1, String s2) {
        int[] arr = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sb.append((char)i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }
}
