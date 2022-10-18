public class K15SearchMoun {
    public static void main(String[] args) {

    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);

        int firstTry = orderEgnostic(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
        return orderEgnostic(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndex(int[] arr) {
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

    static int orderEgnostic(int[] arr, int target, int st, int end) {
        // int st = 0, end = arr.length - 1;

        // FIND ASCENDING OR DESCENDING?

        boolean isAsc = arr[st] < arr[end];
        // it is same as if else

        while (st <= end) {
            // find the middle element

            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

        }
        return -1;
    }
}
