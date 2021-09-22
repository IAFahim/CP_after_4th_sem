public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        int a = 0, b = 0;
        System.out.println(s + ", " + part1 + ", " + part2);
        if(s.isBlank()){
            if(part1.isBlank() && part2.isBlank()){
                return true;
            }else {
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (a < part1.length() && part1.charAt(a) == s.charAt(i)) {
                a++;
            }
            if (b < part2.length() && part2.charAt(b) == s.charAt(i)) {
                b++;
            }
        }
        if (a == b) {
            if (part1.equals(part2) || s.isEmpty()) return false;
        }
        return (a + b) == s.length() && part1.length() + part2.length() == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isMerge("", "", ""));
    }
}
