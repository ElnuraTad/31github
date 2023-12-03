public class ProblemSolve1 {

//    136. Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//    You must implement a solution with a linear runtime complexity and use only constant extra space.
//    Example 1:
//
//    Input: nums = [2,2,1]
//    Output: 1
//    Example 2:
//
//    Input: nums = [4,1,2,1,2]
//    Output: 4

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProblemSolve1 solution = new ProblemSolve1();

        int[] nums1 = {2, 2, 1};
        System.out.println("Output for nums1: " + solution.singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output for nums2: " + solution.singleNumber(nums2)); // Output: 4
    }
}