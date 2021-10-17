public class CreditCardMask {

    public static String maskify(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if(str.length()<=4)return str;
        for (int i = str.length() - 1; i >= str.length() - 4; i--) {
            stringBuilder.append(str.charAt(i));
        }
        for (int i = 0; i < str.length()-4; i++) {
            stringBuilder.append('#');
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(maskify("1"));
    }
}
