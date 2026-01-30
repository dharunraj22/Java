package LeetCode;

class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
      int maxSum = 0, currSum = 0;
      for (int i=0; i<k; i++) {
        maxSum += nums[i];
      }
      currSum = maxSum;
      for (int i=k; i<nums.length; i++) {
        currSum += nums[i] - nums[i-k];
        maxSum = Math.max(maxSum, currSum);
      }
      return (double) maxSum/k;
    }
}