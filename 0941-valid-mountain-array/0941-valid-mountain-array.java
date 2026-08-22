class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) 
            return false;
        int peak = findPeak(arr);
        if (peak == 0 || peak == arr.length - 1) {
            return false;
        }
        return checkIncrease(arr, peak) && checkDecrease(arr, peak);
    }
    
    public boolean checkIncrease(int[] arr, int peak) {
        for (int i = 0; i < peak; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkDecrease(int[] arr, int peak) { 
        for (int i = peak; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}