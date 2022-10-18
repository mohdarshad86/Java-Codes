import java.util.Arrays;

public class K16BinSearch2D {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 },
                { 16, 17, 18 }
        };

        // int target = 34;

        System.out.println(Arrays.toString(BinSearch(arr, 17)));

    }

    // SEARCH IN THE ROW PROVIDING BW COLUMN PROVIDED
    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] BinSearch(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // Caution:Matrix maybe empty

        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // RUN THE LOOP TILL THE 2 ROWS REMAINING
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // NOW WE HAVE TWO ROWS
        // CHECK WHETHER THE TARGET IS IN THE COLUMN OF 2 ROWS

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // otherwise search in 1st half

        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // search in 4th half
        else {
            return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}
