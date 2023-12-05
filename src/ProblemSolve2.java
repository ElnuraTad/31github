public class ProblemSolve2 {

//    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//    Return k.
//    Example 1:
//
//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//    P
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0; // Pointer for elements not equal to val
        int right = 0; // Pointer to iterate through the array

        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);

        System.out.print("Output: " + result + ", nums = [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i < result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
