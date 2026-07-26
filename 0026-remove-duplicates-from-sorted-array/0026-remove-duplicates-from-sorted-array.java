class Solution {
    public int removeDuplicates(int[] nums) {
        int nondupe =0;
        if(nums.length == 0){
            return 0;
        }

        for(int i =1;i<nums.length;i++){

            if (nums[nondupe]!=nums[i]){
                nondupe++;
                nums[nondupe] =nums[i];
                
            }
        }
    
        return nondupe+1;
    }
}