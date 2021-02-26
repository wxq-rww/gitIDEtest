import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Test1 test1 =new Test1();
        test1.name(new int[]{1,2,3,4,5,3,3});
    }





    public boolean name(int[] nums) {
        Map<Integer,Integer> map =new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            int patNumbers=nums[i];
            if (map.containsKey(patNumbers)){
                System.out.println(i);
                return true;
            }
          map.put(patNumbers,i);
        }
        return false;

    }


    
}
