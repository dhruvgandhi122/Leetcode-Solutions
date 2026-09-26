class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int index=-1;
        for(int i=0;i<nums1.length;i++){
            for(int j=0 ;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    nums1[i]=greaterElement(index,nums2);
                    break;
                    
                }
            }
        }
        return nums1;
    }
    public int greaterElement(int index, int[] nums2){
        for(int k=index;k<nums2.length-1;k++){
            if(nums2[k+1]>nums2[index]){
                return nums2[k+1];
            }
        }
        return -1;
    }
}