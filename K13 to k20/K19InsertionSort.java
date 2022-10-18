import java.util.Arrays;

//import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class K19InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 0, -23, 56, 18 };
        insSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);

                else
                    break;
            }
        }
        return;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
