public class K15QuesonBS {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int target = 1;

        System.out.println(ceiling(arr, target));
        // Ceiling will give greater element than target

        System.out.println(floor(arr, target));
        // floor will give smaller element

    }

    static int ceiling(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int st = 0, end = arr.length - 1;
        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return arr[st];

    }

    static int floor(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }

        int st = 0, end = arr.length - 1;
        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return arr[end];

    }
}
