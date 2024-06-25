class Solution
{
    public long power(int x,int y){
        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
            if (result > Integer.MAX_VALUE) {
                return Long.MAX_VALUE; // Avoid overflow
            }
        }
        return result;
    }
    public int NthRoot(int n, int m)
    {
        // code here
        int low = 0, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midPower = power(mid, n);
            if (midPower == m) {
                return mid;
            } else if (midPower < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
