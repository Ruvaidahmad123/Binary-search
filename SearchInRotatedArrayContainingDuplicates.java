class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            //the only problem arises when array is {3,1,2,3,3,3,3} here low mid and high all are equal so agar target element yeh nahi hai{jo ki element extreme ends par hai} to ham seedhe condition trim kar denge low++ and high--
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }
            //identify sorted part
            //left sorted
            else if(nums[low]<=nums[mid]){
                //if present between them
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                //eliminate left half
                else{
                    low=mid+1;
                }
            }
            // or if it is right sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
