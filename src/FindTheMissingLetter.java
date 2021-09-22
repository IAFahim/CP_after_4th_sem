public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        char beforeStart= (char) (array[0]-1);
        int count=0;
        for (int i = 1; i < array.length; i++) {
            if(array[i-1]+1==array[i]){
                count++;
            }else {
                return (char) (array[i-1]+1);
            }
        }
        return beforeStart;
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
