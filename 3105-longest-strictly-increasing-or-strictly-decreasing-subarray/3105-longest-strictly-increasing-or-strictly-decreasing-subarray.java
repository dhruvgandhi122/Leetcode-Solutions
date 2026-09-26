class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int result=0;
        int res1=longestIncrease(nums);
        int res2=longestDecrease(nums);
        if(res1<=res2){
            result= res2;
        }else{ 
            result=res1;
        }
        return result;
    }
    public int longestIncrease(int[] nums){
        int max1=1;
        for(int i=0;i<nums.length;i++){
            int longlength=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    longlength++;
                }else{
                    break;
                }
            }
            if(max1<longlength){
                max1=longlength;
            }
        }
        return max1;
    }
    public int longestDecrease(int[] nums){
        int max2=1;
        for(int i=0;i<nums.length;i++){
            int length=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    length++;
                }else{
                    break;
                }
            }
            if(max2<length){
                max2=length;
            }
        }
        return max2;
    }
}