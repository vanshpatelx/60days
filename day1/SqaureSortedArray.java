// https://leetcode.com/problems/squares-of-a-sorted-array/
// logic : first go to nearest of Zero and then take two pointers, one on less then zero and another on zero or bigger
// add element which is smallest

public class SqaureSortedArray {

    public int[] sortedSquares(int[] nums) {
        int j = 0;

        for (int num : nums) {
            if (num >= 0) {
                break;
            }
            j++;
        }

        int ind1 = j - 1; //  last -ve num
        int ind2 = j;     // first non -ve num

        int[] temp = new int[nums.length];

        for (int i = 0; i < temp.length; i++) {
            if (ind1 >= 0 && (ind2 >= nums.length || Math.abs(nums[ind1]) <= Math.abs(nums[ind2]))) {
                temp[i] = nums[ind1] * nums[ind1];
                ind1--;
            } else {
                temp[i] = nums[ind2] * nums[ind2];
                ind2++;
            }
        }

        return temp;
    }
}
