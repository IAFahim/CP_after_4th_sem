public class Watermelon {
    public static boolean divide(int weight) {
        if(weight<3)return false;
        return (weight&1)==0;
    }

    public static void main(String[] args) {
        System.out.println(divide(4));
        System.out.println(divide(5));
    }
}
