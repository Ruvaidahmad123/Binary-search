// Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

// Example 1:

// Input:
// N = 7, X = 2
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 4
// Explanation: 2 occurs 4 times in the
// given array
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
    int count(int[] arr, int n, int x) {
        // code here
        //last occurence-first occurence+1 because its sorted
        int lb=lowerbound(arr,n,x);
        if(lb==n || arr[lb]!=x){
            return 0;
        }
        int ub=upperbound(arr,n,x);
        return ub-1-lb+1;
        
    }
}
