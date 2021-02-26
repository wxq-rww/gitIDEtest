public class Solution27 {

    public int removeElement(int[] nums, int val) {
        if (nums==null||nums.length==0){
            return  0;
        }
        int l=0;
        int r=nums.length-1;
        while (l<r){
            while (l<r&&nums[l]!=val){
                l++;
            }
            while (l<r&&nums[r]==val){
                r--;
                }
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;

        }
        return nums[l]==val?l:l+1;




    }




}
