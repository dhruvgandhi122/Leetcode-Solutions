class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int inc=nums[i];
            for(int j=i;j<nums.length-1;j++){
                
                if(nums[j]<nums[j+1]){
                    inc = inc+nums[j+1];
                }else{
                    break;
                }
            }
            if(inc>max){
                max=inc;
            }
        }
        return max;
    }
}