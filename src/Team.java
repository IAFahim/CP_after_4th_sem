import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(), solve=0;
        for (int i = 0; i < n; i++) {
            int f=sc.nextInt(),O=sc.nextInt(),a=sc.nextInt();
            if(2<=(f+O+a)){
                solve=solve+1;
            }
        }
        System.out.println(solve);
    }
}
