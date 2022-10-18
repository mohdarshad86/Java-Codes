import java.util.Arrays;

public class K31QuickSortRec {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        // QuickSort(arr, 0, arr.length - 1);
        // System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.sort(arr));
    }

    static void QuickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low, e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it'll not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, sort two halves
        QuickSort(nums, low, e);
        QuickSort(nums, s, high);
    }
}
