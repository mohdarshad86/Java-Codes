import java.util.Arrays;

public class K12 {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 1, 5, 2 };

        MissingNumber(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int MissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;

            if (arr[i] < arr.length && arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
