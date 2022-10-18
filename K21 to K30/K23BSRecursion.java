public class K23BSRecursion {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 66;

        System.out.println(BinSearchRec(arr, target, 0, arr.length - 1));
    }

    static int BinSearchRec(int[] arr, int target, int st, int end) {

        if (st > end) {
            return -1;
        }

        int mid = st + (end - st) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BinSearchRec(arr, target, st, mid - 1);
        } else
            return BinSearchRec(arr, target, mid + 1, end);

    }
}
