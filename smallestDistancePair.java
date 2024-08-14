class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, low = 0, ans = 0, high = nums[n - 1] - nums[0];
        for (int cnt = 0; low <= high; cnt = 0) {
            int mid = (low + high) / 2;
            for (int i = 0, j = 0; i < n; i++) {
                while (j < n && nums[j] <= nums[i] + mid)
                    j++;
                cnt += j - i - 1;
            }
            if (cnt < k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
