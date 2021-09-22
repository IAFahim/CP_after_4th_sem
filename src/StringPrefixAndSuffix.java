public class StringPrefixAndSuffix {
    public static int solve(String s) {
        System.out.println(s);
        int count = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++) {
            if (s.substring(0, i + 1).equals(s.substring(j - i))) {
                count = Math.max(s.substring(0, i + 1).length(), count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve("aaaaa"));
    }
}
