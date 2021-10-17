public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        while (p0 < p) {
            p0 += p0 * (percent / 100) + aug;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
}
