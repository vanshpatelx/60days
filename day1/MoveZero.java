// logic : making new array. adding all non zero elements and fill with zero
// https://leetcode.com/problems/move-zeroes/
public class MoveZero{
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        
        for(int i : nums){
            if(i != 0) arr[count++] = i;
        }
        while(count < nums.length)
            arr[count++] = 0;
        
        System.arraycopy(arr, 0, nums, 0, nums.length);
    }

}