public class K15PeakIndex {
    public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[] arr) {

        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // youre in dec part
                // maybe the ans but look at left

                end = mid;

            } else {
                // youre in asc part
                st = mid + 1;// bc we know that mid+1 element > mid ele

            }

        }
        // in the end start=end
        // start and end are always trying to find max elements
        // if only one element remain that is our ans

        return st; // return end;
    }
}
