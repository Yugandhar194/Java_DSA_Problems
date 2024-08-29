public class MooreVotingAlgorithm {

    public static int findMajorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int candidate = nums[0];
        int count = 1;

        // Phase 1: Find a candidate for the majority element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Phase 2: Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalStateException("No majority element found");
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,100};

        try {
            int majorityElement = findMajorityElement(nums);
            System.out.println("Majority element: " + majorityElement);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}