import java.util.*;
import static java.lang.System.out;

public class FirstDuplicateCharacterExample{
    
    public static char Solution(String S){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char result = '\0';
        for (int i = 0; i < S.length(); i++) {
            if (!map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i),1);
            } else{
                result =  S.charAt(i);
                break;
            }
        }
        return result;
    }
    
    public static void main(String []args){
        System.out.println(Solution("CharacterExample"));
    }
}
