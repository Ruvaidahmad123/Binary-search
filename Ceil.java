Ceil of X is the smallest element which is greater than or equal to X. Ceil of X doesn’t exist if X is greater than greatest element of Arr[].


static int getCeil(int arr[], int n, int x)
    {
       int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = arr[mid];
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
