/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        if (peak == -1) {
            return -1;
        }
    
        int firstTry = OrderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        
        int secondTry = OrderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
        if (secondTry != -1) {
            return secondTry;
        }
        return -1;
    }

    public int peakIndexInMountainArray(MountainArray arr) {
        int beg = 0;
        int end = arr.length() - 1;
        
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid; 
            } else {
                beg = mid + 1;
            }
        }
        return beg;
    }

    public int OrderAgnosticBinarySearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }
            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}