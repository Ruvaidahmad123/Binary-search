// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
// Example 2:

// Input: arr = [1,2,3,4], k = 2
// Output: 6
// Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);   //missing integers till that index.
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } 
        //after this high will point to lower index and low will point to upper index i.e nearby indices of missing number.
        return high+k+1;    //formula  is actually arr[high]+more
                            //more=k-missing    //missing=arr[high]-(high+1)
    }                      // ans=arr[high]+more-->arr[high]+k-missing--->arr[high]+k-(arr[high]-high-1)
    //ans=high+k+1
}
