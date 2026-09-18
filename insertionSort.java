class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return true;

            // can't tell which half is sorted, shrink both ends
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
            }
            // left half is sorted
            else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {2, 5, 6, 0, 0, 1, 2};
    int target = 0;
    boolean result = solution.search(nums, target);
    System.out.println("Target found: " + result); // true
}
    }
