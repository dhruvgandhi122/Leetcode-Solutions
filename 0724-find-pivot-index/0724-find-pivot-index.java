class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum =0;
        int leftsum=0;
        for(int i:nums){
            totalsum += i;
        }
        int pivot =-1;

        for(int i=0;i<nums.length;i++){
            if(leftsum ==totalsum-leftsum-nums[i]){
                pivot =i;
                break;
            }
            leftsum += nums[i];
                
        }
        
        return pivot;
    }
}