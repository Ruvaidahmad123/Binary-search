// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]


class Solution {
    static int lowerbound(int arr[], int n, int x)
    {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int upperbound(int arr[], int n, int x)
    {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerbound(nums,n,target);
        int ub=upperbound(nums,n,target);
        int arr[]=new int[2];
        if(lb==n || nums[lb]!=target){   //edge case if lowerbound ==n that means element not found and if lower bound is found but its not target then return -1  example target=7
          // and our array={1,5,8,9} here lower bound is elemnt 8 but that wasn't needed as we are searchinf first occurence of 7
            arr[0]=-1;    
            arr[1]=-1;
            return arr;
        }
        arr[0]=lb;
        arr[1]=ub-1;
        return arr;
    }
}
