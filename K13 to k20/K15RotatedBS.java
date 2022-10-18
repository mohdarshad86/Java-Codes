public class K15RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        System.out.println(search(arr, target));
        System.out.println(findpivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);

        // if you dont find the pivot, it means array is not rotated

        if (pivot == -1) {
            // just do normal bin Search
            return binsearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, u've 2 sorted arrays

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binsearch(nums, target, 0, pivot - 1);
        }
        return binsearch(nums, target, pivot + 1, nums.length - 1);

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
