public class Playingwithdigits {

    public static long digPow(int n, int p) {
        String str = Integer.toString(n);
        long answer = 0;
        for (int x = p,i=0; i < str.length(); i++) {
            answer += Math.pow(str.charAt(i) - '0', x++);
        }
        if(answer%n==0){
            return answer/n;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(695, 2));
        System.out.println(digPow(46288, 3));
    }
}
