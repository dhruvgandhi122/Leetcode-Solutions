class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=1;
        int i=1;
        while(i<n){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>2){
                    for(int j=i;j<n-1;j++){
                        nums[j]=nums[j+1];
                    }
                    n--;
                }else{
                    i++;
                }
            }else{
                count=1;
                i++;
            }
        }
        return n;
    }
}