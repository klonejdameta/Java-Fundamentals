package JavaFundamentals.Coding;

class LongestSubsequence {
    // Function to find the length of the longest increasing subsequence
    public static int LongestSub(int[] arr, int i, int n, int prev) {
        if (i == n) {
            return 0;
        }

        // case 1: exclude the current element and process the
        // remaining elements
        int excl = LongestSub(arr, i + 1, n, prev);

        // case 2: include the current element if it is greater
        // than the previous element in LOS
        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + LongestSub(arr, i + 1, n, arr[i]);
        }

        // return the maximum of the above two choices
        return Integer.max(incl, excl);
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,8,4,2,5,6,11,13,7};

        System.out.print("The length of the LongesSub is "
                + LongestSub(arr, 0, arr.length, Integer.MIN_VALUE));
    }
}