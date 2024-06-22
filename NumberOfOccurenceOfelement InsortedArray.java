
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
