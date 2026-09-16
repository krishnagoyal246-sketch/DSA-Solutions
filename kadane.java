class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            maxi = Math.max(maxi, sum);

            if (sum < 0)
                sum = 0;
        }

        return maxi;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result); // Output: 6
    }
}