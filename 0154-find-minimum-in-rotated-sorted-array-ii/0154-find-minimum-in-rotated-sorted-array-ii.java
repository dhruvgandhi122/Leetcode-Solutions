class Solution {
    public int findMin(int[] nums) {
        int peak= findPeak(nums);
        if(peak == -1){
            return nums[0];
        }
        return nums[peak+1];
    }

    public int findPeak(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }
            if(arr [start]==arr[mid] && arr[mid]==arr[end]){
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(start<end && arr[end-1]>arr[end]){
                    return end-1;
                }
                end --;
            }
            if(arr[start]<arr[mid] || arr[start]==arr[mid]  && arr[mid]>arr[end]){
                start =mid +1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }
}
