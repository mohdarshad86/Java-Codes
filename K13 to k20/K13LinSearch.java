import java.util.Arrays;

public class K13LinSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int target = 2;
        // System.out.println(linsearch(arr, target));

        String name = "Kunal";
        char targ = 'u';
        System.out.println(searchStr2(name, targ));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static int linsearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return element;

            }

        }
        return -1;

    }

    static boolean searchStr(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchStr2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
