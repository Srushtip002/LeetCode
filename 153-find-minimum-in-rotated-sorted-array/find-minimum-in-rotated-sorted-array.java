class Solution {
    public int findMin(int[] nums) {
     
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            // If current part is already sorted
            if (nums[low] < nums[high]) {
                return nums[low];
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            }
            // Right half is sorted
            else {
                high = mid;
            }
        }

        return nums[low];
    }
}