public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears){
        return sonYears*2>=dadYears?sonYears*2-dadYears:dadYears-sonYears*2;
    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,0));
        System.out.println(TwiceAsOld(30,7));
        System.out.println(TwiceAsOld(45,30));
    }
}
