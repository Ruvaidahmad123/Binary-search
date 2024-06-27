class Solution {
   int lowerbound(int arr[], int n, int x)
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
    int rowWithMax1s(int arr[][], int n, int m) {
        int countmax=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int no_of_1s=m-lowerbound(arr[i],m,1);
            if(no_of_1s>countmax){
                countmax=no_of_1s;
                index=i;
            }
        }
        return index;
    }
}
