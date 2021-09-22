public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isOddA=(flower1&1)==0;
        boolean isOddB=(flower2&1)==0;
        return isOddA^isOddB;
    }

    public static void main(String[] args) {
        System.out.println(isLove(1,4));
    }
}
