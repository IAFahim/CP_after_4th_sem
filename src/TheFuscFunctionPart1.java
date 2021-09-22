public class TheFuscFunctionPart1 {
    public static int fusc(int n) {
        if(n<=1)return n;
        if((n&1)==0)return fusc(n/2);
        return fusc(n / 2) + fusc((n / 2) + 1);
    }

    public static void main(String[] args) {
        System.out.println(fusc(85));
    }
}
