public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb=new StringBuilder(numberString.length());
        for (int i = 0; i < numberString.length(); i++) {
            sb.append(numberString.charAt(i)<'5'?0:1);
        }
        return sb.toString();
    }
}
