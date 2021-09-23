import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        StringBuilder sb=new StringBuilder(String.valueOf(s[0].charAt(0)));
        for (int i = 1; i < s[0].length(); i++) {
            sb.append("***").append(s[0].charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
}
