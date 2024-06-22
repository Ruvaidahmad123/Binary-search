// Given an ascending sorted rotated array arr of distinct integers of size n. The array is right-rotated k times. Find the value of k.

// Example 1:

// Input:
// n = 5
// arr[] = {5, 1, 2, 3, 4}
// Output: 1
// Explanation: The given array is 5 1 2 3 4. 
// The original sorted array is 1 2 3 4 5. 
// We can see that the array was rotated 
// 1 times to the right.
// Example 2:

// Input:
// n = 5
// arr[] = {1, 2, 3, 4, 5}
// Output: 0
// Explanation: The given array is not rotated.

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){        //whatever is the index of minimum element that much times array has been rotated.so just find index of minimum element.
                    ans=arr[low];
                    index=low;
                }
                break;
            }
            if(arr[mid]>=arr[low]){
                if(arr[mid]<=ans){
                    ans=arr[mid];
                    index=low;
                }
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<=ans){
                    ans=arr[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
}
