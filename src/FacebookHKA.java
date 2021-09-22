import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FacebookHKA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int till = Integer.parseInt(sc.nextLine());
        boolean arr[] = new boolean[128];
        arr['A'] = true;
        arr['E'] = true;
        arr['I'] = true;
        arr['O'] = true;
        arr['U'] = true;
        for (int z = 1; z <= till; z++) {
            String str = sc.nextLine();
            int vc=0,cc = 0;
            HashMap<Character,Integer> vowel=new HashMap<>();
            HashMap<Character,Integer> consonant=new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                if(arr[c]){
                    vc++;
                    Integer x=vowel.get(c);
                    if(x!=null){
                       vowel.put(c,++x);
                    }else {
                        vowel.put(c,1);
                    }
                }else {
                    cc++;
                    Integer x=consonant.get(c);
                    if(x!=null){
                        consonant.put(c,++x);
                    }else {
                        consonant.put(c,1);
                    }
                }
            }
            int mvc=0,mcc=0;
            for (Character o : vowel.keySet()) {
                mvc=Math.max(mvc,vowel.get(o));
            }
            for (Character o : consonant.keySet()) {
                mcc=Math.max(mcc,consonant.get(o));
            }
            System.out.println("Case #"+z+": " + (Math.min(vc+(2*(cc-mcc)),cc+(2*(vc-mvc)))));
        }
    }
}
