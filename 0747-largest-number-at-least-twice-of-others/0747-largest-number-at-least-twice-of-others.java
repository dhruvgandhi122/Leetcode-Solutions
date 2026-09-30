class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=index){
                nums[j]*=2;

            }
            if(nums[j]>max){
                return -1;
            }
        }
        return index;
    }
}