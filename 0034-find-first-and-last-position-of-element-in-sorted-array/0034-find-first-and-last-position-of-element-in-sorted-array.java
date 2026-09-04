class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []result = new int [2];
        result[0]=findFirst(target,nums);
        result[1]=findLast(target , nums);
        return result;
        
    }
     public static int findFirst(int target,int []nums){
        int beg=0;
        int end =nums.length-1;
        int res =-1;
        while(beg<=end){
            int mid = beg+(end - beg)/2;
            
            if(target<nums[mid]){
                end=mid-1;
            }else if (target> nums[mid]){
                beg = mid +1;
            }else if (target==nums[mid]){
                res =mid;
                end=mid-1;
            }

        }
        return res;

    }
     public static int findLast(int target,int []nums){
        int beg=0;
        int end =nums.length -1;
        int ans =-1;
        while(beg<=end){
            int mid = beg +(end-beg)/2;
            if (target>nums[mid]){
                beg=mid+1;

            }else if(target == nums[mid]){
                ans =mid;
                beg=mid+1;

            }else if(target<nums[mid]){
                end = mid -1;
            }
        }
        return ans;

    }
    
}