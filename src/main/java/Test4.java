import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static void main(String[] args) {
        Test4 test4=new Test4();
        test4.wordPattern("abab","dog cat cat dog");
    }


    public boolean wordPattern(String pattern, String s) {
         if (null==pattern||null==s){
        System.out.println(false);
        return false;
    }
    String[] st = s.split(" ");
        if (pattern.length()!=st.length){
        System.out.println(false);
        return  false;
    }
    Map<Character,String> map=new HashMap<Character, String>();
        for (int i = 0; i <pattern.length() ; i++) {
        char pacharAt = pattern.charAt(i);
        if (map.containsKey(pacharAt)){
            if (!map.get(pacharAt).equals(st[i])){
                System.out.println(false);
                return  false;
            }
        }else {
            if (map.containsValue(st[i])){
                System.out.println(false);
                return false;
            }else {
                map.put(pacharAt,st[i]);
            }
        }


    }




        System.out.println(true);
        return true;
}
}
