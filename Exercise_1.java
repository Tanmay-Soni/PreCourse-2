class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    {     
        //Write your code here
        // Perform binary search to find the index of element x in arr[l..r]
        while (l <= r) {
            // Calculate the middle index
            int m = (l + (r - l)) / 2;
            
            // If element at middle index is equal to x, return its index
            if (arr[m] == x) {
                return m;
            } 
            // If x is smaller than the element at middle index, search in the left half
            else if (x < arr[m]) {
                r = m - 1; // Update right boundary
            } 
            // If x is greater than the element at middle index, search in the right half
            else {
                l = m + 1; // Update left boundary
            }
        }
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
