public class k13LinSearch2 {
    public static void main(String[] args) {

        int arr[] = { 18, 12, -7, 3, 14, 28 };
        int target = 14;

        // System.out.println(search(arr, target, 1, 4));

        // System.out.println(min(arr));

        int arr2d[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int tar = 34;

        System.out.println(search2d(arr, tar));
    }

    static int search(int[] arr, int target, int st, int end) {
        for (int ind = st; ind <= end; ind++) {
            int element = arr[ind];
            if (element == target) {
                return ind;

            }

        }
        return -1;

    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
