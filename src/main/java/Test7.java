import java.util.HashMap;
import java.util.Map;

public class Test7 {

    public int lengthOfLongestSubstring(String s) {
        if (null==s||s.isEmpty()){

            return 0;
        }
        int preNode=0;
        int atferNode=0;
        int max = 0;
        char[] charsx = String.valueOf(s).toCharArray();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (; preNode <charsx.length; preNode++) {
            if (map.containsKey(charsx[preNode])){
                atferNode=Math.max(atferNode,map.get(charsx[preNode])+1);
            }
                map.put(charsx[preNode],preNode);
                max=Math.max(max,preNode-atferNode+1);



        }

        return max;
    }


    public static void main(String[] args) {
        Test7 test7 =new Test7();
        test7.lengthOfLongestSubstring("");
    }



}
