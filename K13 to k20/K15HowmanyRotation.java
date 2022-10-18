public class K15HowmanyRotation {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 3, 2, 1, 0 };

        System.out.println(countRotation(arr));

    }

    static int countRotation(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }

    static int findpivot(int[] arr) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[st]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
}
