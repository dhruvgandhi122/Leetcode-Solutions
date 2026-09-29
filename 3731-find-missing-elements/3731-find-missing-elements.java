import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int n:nums){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        Arrays.sort(nums);
        List<Integer>list =new ArrayList<>();
        int k=0;
        for(int i=min;i<=max;i++){
            if(k<nums.length && nums[k]!=i){
                list.add(i);
            }else{
                k++;
            }
            
        }
        return list;
    }
}