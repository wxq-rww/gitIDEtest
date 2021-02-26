import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2=new Test2();
        test2.groupAnagrams2(new  String[]{"eat","tea","tan","ate","nat","bat"});
    System.out.println("___________________________________________");
        test2.groupAnagrams(new  String[]{"eat","tea","tan","ate","nat","bat"});
    }





    public List<List<String>> groupAnagrams2(String[] strs) {
       Map<String,ArrayList> result =new HashMap<String, ArrayList>();
       for (String s:strs){
           char[] temp = s.toCharArray();
           Arrays.sort(temp);
            String  key=new String(temp);
            if (!result.containsKey(key)){
                result.put(key,new ArrayList<Object>());
            }
           result.get(key).add(s);
       }
     System.out.println(result.values());
       return new ArrayList(result.values());
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,ArrayList> map =new HashMap<String, ArrayList>();
        for (String tem:strs){
            char[] chars1 = tem.toCharArray();
            Arrays.sort(chars1);
            String  chams=String.valueOf(chars1);
            if (!map.containsKey(chams)){
                map.put(chams,new ArrayList<Object>());
            }
            map.get(chams).add(tem);
        }
        System.out.println(map.values());
        return new ArrayList(map.values());}


}
