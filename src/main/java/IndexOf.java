public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. If n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i; // Return the index if the number is found
            }
        }
        // If the loop completes without finding the number, return -1
        return -1;
    }
}
