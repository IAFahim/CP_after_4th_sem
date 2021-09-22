import java.util.Stack;

public class LongestCommonSubsequence {
    public static String lcs(String x, String y) {
        int[][] L = new int[x.length()+1][y.length()+1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        int i = x.length(), j = y.length();
        StringBuilder sb = new StringBuilder();
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                sb.append(x.charAt(--i));
                --j;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(lcs("abcdef", "abc"));
    }
}
