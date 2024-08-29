public class SearchIntoRotatedArray {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check which half is sorted
            if (nums[low] <= nums[mid]) {  // Left half is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // Search in the left sorted half
                } else {
                    low = mid + 1;  // Search in the right unsorted half
                }
            } else {  // Right half is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;  // Search in the right sorted half
                } else {
                    high = mid - 1;  // Search in the left unsorted half
                }
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int target = 6;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
