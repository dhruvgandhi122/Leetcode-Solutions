class Solution {
    public boolean isMonotonic(int[] nums) {
        return increaseMonotone(nums) || decreaseMonotone(nums);
    }

    public boolean increaseMonotone(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean decreaseMonotone(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}