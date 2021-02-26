public class Solution35 {
    public int searchInsert1(int[] nums, int target) {
        if (nums==null||nums.length==0){
            return  0;
        }

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>=target){
                return  i;
            }

        }
        return  nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        if (nums==null||nums.length==0){
            return  0;
        }
    int left=0;
    int right=nums.length-1;
    while (left<right){
     int mid=left+(right-left)/2;
     if (nums[mid]==target){
         return  mid;
     }else if (nums[mid]>target){
         right=mid;
     }else {
         left=mid+1;
     }



    }

        return  nums[left]<target?left+1:left;


    }


}
