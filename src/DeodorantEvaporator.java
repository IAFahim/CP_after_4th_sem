public class DeodorantEvaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int day=0;
        threshold=content*(threshold/100);
        evap_per_day=(1-evap_per_day/100);
        for (int i = 0; content>=threshold; i++) {
            content*=evap_per_day;
            day++;
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10,10,10));
    }
}
