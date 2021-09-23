import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i--);
            }
        }
        return listOfNumbers;
    }

    public static void main(String[] args) {
        System.out.println(filterOddNumber(new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7))));
    }
}
