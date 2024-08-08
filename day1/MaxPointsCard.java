// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// logic : first thing here is it's contineous so we directly go on sliding window, otherwise have to check every case in DP
public class MaxPointsCard {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;

        int currentSum = 0;
        for (int i = n - k; i < n; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxSum = currentSum;
    
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - cardPoints[n - k + i] + cardPoints[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;

    }
}
