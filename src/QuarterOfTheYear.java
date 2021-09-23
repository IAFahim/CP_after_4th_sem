public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        return (int) Math.ceil(month/ 3.0);
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(11));
    }
}
