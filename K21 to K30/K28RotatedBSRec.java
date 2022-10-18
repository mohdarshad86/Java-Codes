public class K28RotatedBSRec {
    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };

        System.out.println(RotatedBS(arr, 4, 0, arr.length - 1));
    }

    static int RotatedBS(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return RotatedBS(arr, target, s, mid - 1);
            } else {
                return RotatedBS(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target < arr[e]) {
            return RotatedBS(arr, target, mid + 1, e);
        } else {
            return RotatedBS(arr, target, s, mid - 1);
        }
    }
}
