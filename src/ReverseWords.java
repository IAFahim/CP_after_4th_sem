public class ReverseWords {
    public static String reverseWords(String str) {
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder(strings[strings.length-1]);
        for (int i = strings.length - 2; i >= 0; i--) {
            sb.append(' ').append(strings[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }
}
