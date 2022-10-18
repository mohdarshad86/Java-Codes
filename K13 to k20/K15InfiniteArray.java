public class K15InfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };

        int target = 90;

        System.out.println(findRange(arr, target));

    }

    static int findRange(int[] arr, int target) {
        // FIRST START WITH BOX OF SIZE 2

        int st = 0;
        int end = 1;

        // condition for target to lie in range

        while (target > arr[end]) {
            int newst = end + 1;
            // double the box value
            end = end + (end - st + 1) * 2;
            st = newst; // just swap
        }
        return binsearch(arr, target, st, end);
    }

    static int binsearch(int arr[], int target, int st, int end) {
        // int st = 0, end = arr.length - 1;

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
}
