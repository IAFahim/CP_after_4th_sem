import java.awt.*;
import java.util.Locale;

public class ConvertAHexStringToRGB {
    public static int[] hexStringToRGB(String hex) {
        int[] arr = new int[3];
        for (int i = 0,j=0; i < hex.length() - 1; i += 2) {
            arr[j++]=Integer.parseInt(hex.substring(i + 1, i + 3),16);
        }
        return arr;
    }

    public static void main(String[] args) {
        hexStringToRGB("#FF9933");
    }
}
