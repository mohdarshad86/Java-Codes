import java.util.ArrayList;

public class K28ArraySorted {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4, 4, 5, 9, 9, 9, 9, 56 };
        // System.out.println(SortedArr(arr, 0));
        // System.out.println(Search(arr, 9, 0));
        // System.out.println(SearchInd(arr, 4, 0));
        // System.out.println(Searchlast(arr, 4, arr.length - 1));
        ArrayList<Integer> ans = FindAllInd(arr, 9, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean SortedArr(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index + 1] && SortedArr(arr, index + 1));
    }

    static boolean Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return (arr[index] == target || Search(arr, target, index + 1));
    }

    static int SearchInd(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return (SearchInd(arr, target, index + 1));
    }

    static int Searchlast(int[] arr, int target, int index) {

        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return Searchlast(arr, target, index - 1);
    }

    // static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> FindAllInd(int[] arr, int target,
            int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return FindAllInd(arr, target, index + 1, list);
    }
}
