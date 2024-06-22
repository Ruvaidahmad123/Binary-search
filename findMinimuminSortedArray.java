// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.
// Example 1:
// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.
// Example 2:
// Input: nums = [4,5,6,7,0,1,2]
// Output: 0
// Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
// Example 3:
// Input: nums = [11,13,15,17]
// Output: 11
// Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){     //check if left part is sorted
                ans=Math.min(ans,nums[low]);   //{3,4,5,1,2} agr hame dikh rha left part along with nums[mid] is sorted toh ham  uss window ki minimum value that is nums[low] le lenge
              //and baaki ko compare karne ka mtlb nahi cuz minimum value hi low wali hogi as its sorted so fir low=mid+1 kar denge to check if there is any other minimum value in right half
                low=mid+1;
            }
            else if(nums[mid]<=nums[high]){    //check if right part is sorted
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
