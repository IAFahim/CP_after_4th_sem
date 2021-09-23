public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(" * ").append(num).append(" = ").append(num);
        for (int i = 2; i <= 10; i++) {
            sb.append('\n').append(i).append(" * ").append(num).append(" = ").append(num * i);
        }
        return sb.toString();
    }
}
