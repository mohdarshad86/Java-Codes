import java.util.Arrays;

public class k132Dsearch {
    public static void main(String[] args) {
        int arr2d[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 123 }
        };
        int target = 127;
        int[] ans = search2d(arr2d, target);

        // System.out.println(Arrays.toString(ans));

        System.out.println(max(arr2d));
    }

    static int[] search2d(int[][] arr2d, int target) {

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {

                if (arr2d[row][col] == target) {
                    return new int[] { row, col };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }
}
