public class SumOfNumbers {
    public static int GetSum(int a, int b) {
        if (a == b) return a;
        int sum = 0;
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(0, -1));
        System.out.println(GetSum(0, 1));
    }
}
