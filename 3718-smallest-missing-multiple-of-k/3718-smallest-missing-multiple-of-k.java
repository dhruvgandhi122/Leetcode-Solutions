class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=102;i++){
            if(search(nums,k*i)!=-1){
                return search(nums,k*i);
            }
        }
        return-1;
    }
    public int search(int []nums,int target){
        int found=0;
        for(int i:nums){
            if(target == i){
                found=1;
                break;
            }
        }
        if(found ==1){
            return -1;
        }
        return target;
    }
}