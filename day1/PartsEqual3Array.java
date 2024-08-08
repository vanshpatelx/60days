// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
// logic : catch is where we don't know about sum. but here we know that, so directly some it
// divide by 3 and find index

import java.util.Arrays;

public class PartsEqual3Array {
    public boolean canThreePartsEqualSum(int[] arr) {
        if (Arrays.stream(arr).sum() % 3 != 0) {
            return false;
        }

        int targetSum = Arrays.stream(arr).sum() / 3;
        
        int tempSum = 0;
        int parts = 0;
        
        for (int num : arr) {
            tempSum += num;
            if (tempSum == targetSum) {
                parts++;
                tempSum = 0;
                if (parts == 3) {
                    return true;
                }
            }
        }
        return parts == 3 && tempSum == 0;
    }
}
