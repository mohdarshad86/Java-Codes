public class K14BinSearch {
    public static void main(String[] args) {

        int[] arr = { 189, 112, 104, 0, -2, -3, -4, -15, -16, -18, -22, -45, -89 };
        int target = -2;

        // int ans = binsearch(arr, target);
        // System.out.println(ans);

        int answer = orderEgnostic(arr, target);

        System.out.println(answer);
    }

    // return the index

    static int binsearch(int arr[], int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            // find the middle element

            int mid = st + (end - st) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int orderEgnostic(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

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
