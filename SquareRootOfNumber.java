// Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
// Example 1:
// Input:
// x = 5
// Output: 2
// Explanation: Since, 5 is not a perfect 
// square, floor of square_root of 5 is 2.
// Example 2:
// Input:
// x = 4
// Output: 2
// Explanation: Since, 4 is a perfect 
// square, so its square root is 2.

class Solution
{    
     long floorSqrt(long x)
	 {
            long low=0;
            long high=x;
            long ans=0;
            while(low<=high){
                long mid=low+(high-low)/2;
                if(mid*mid<=x){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
	 }
}
