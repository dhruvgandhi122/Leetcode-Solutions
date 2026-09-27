class Solution {
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                
                for(int j=i+1;j<n;j++){
                    nums[j-1]=nums[j];
                }
                nums[n-1]=0;
            n--; // Reduce active search boundary so we don't re-process trailing zeroes
            i--; // Re-check current index 'i' in case the newly shifted element is also 0
            }
        }
        
    }
}