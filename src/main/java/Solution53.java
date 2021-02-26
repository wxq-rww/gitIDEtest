public class Solution53 {
    public int maxSubArray(int[] nums) {
        int result=nums[0];

        for (int i = 0; i < nums.length; i++) {
            int  temp=0;
            for (int j = i; j <nums.length ; j++) {
                temp=temp+nums[j];
                result=Math.max(result,temp);
            }
        }

   System.out.println(result);
        return  result;
    }


         public static void main(String args[]) {

             Solution53 solution53 = new Solution53();
             solution53.maxSubArray(new int[]{
                     -2,1,-3,4,-1,2,1,-5,4
             });
         }



}


