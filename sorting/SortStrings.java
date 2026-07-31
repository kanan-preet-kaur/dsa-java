class SortStrings {
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * Recursively arranges an array of Strings in ascending order using merge sort
     * implementation
     * <p>
     * Time Complexity: O(n log n)
     * <p>
     * Space Complexity: O(n)
     * 
     * @param arr The array of Strings to be sorted in ascending order
     * @param si  The starting index of the subarray
     * @param ei  The ending index of the subarray
     */
    public static void sort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // sort left part
        sort(arr, si, mid);
        // sort right part
        sort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        int t = 0;
        for (int l = si; l <= ei; l++) {
            arr[l] = temp[t++];
        }
    }
}