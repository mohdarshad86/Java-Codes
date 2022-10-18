import java.util.Scanner;

public class L11Ques {
    public static void main(String[] args) {

        // int
        // arr[5][6]={{1,5,7,9,10};{6,10,12,13,20,21};{9,25,29,30,32,41};{15,55,59,63,68,70},{40,70,79,81,95,105}};

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int rowst = 0;
        int colst = 0;
        int rowen = n - 1;
        int colen = m - 1;

        while (rowst <= rowen && colst <= colen) {

            // FIRST ROW PRINT
            for (int col = colst; col <= colen; col++) {
                System.out.print(matrix[rowst][col] + " ");

            }
            rowst++;

            // FIRST COLUMN PRINT
            for (int row = rowst; row <= rowen; row++) {
                System.out.print(matrix[row][colen] + " ");
            }
            colen--;

            // LAST ROW PRINT
            for (int col = colen; col >= colst; col--) {
                System.out.print(matrix[rowen][col] + " ");
            }
            rowen--;

            // FIRST COLUMN PRINT
            for (int row = rowen; row >= rowst; row--) {
                System.out.print(matrix[row][colst] + " ");
            }
            colst++;
        }
        // System.out.println();
    }
}

// Accio Diagonal Sum Q

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main {
// public static void main(String[] args) throws java.lang.Exception {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// int matrix[][] = new int[n][n];
// int sum = 0;

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// matrix[i][j] = sc.nextInt();
// }

// }

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// if (i == j || (i == 0 && j == n - 1) || (i == n - 1 && j == 0)) {
// sum = sum + matrix[i][j];

// }
// }

// }
// System.out.println(sum);

// }
// }

// //ACCIO NUMBER OF +,- & 0;
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main {

// public static int countzero(int[] arr) {

// int zero = 0;
// for (int i = 0; i < arr.length; i++) {

// if (arr[i] == 0) {
// zero++;
// }
// }
// return zero;
// }

// public static int countneg(int[] arr) {

// int neg = 0;
// for (int i = 0; i < arr.length; i++) {

// if (arr[i] < 0) {
// neg++;
// }
// }
// return neg;
// }

// public static int countpos(int[] arr) {

// int pos = 0;
// for (int i = 0; i < arr.length; i++) {

// if (arr[i] > 0) {
// pos++;
// }

// }
// return pos;
// }

// public static void main(String[] args) throws java.lang.Exception {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// double d = size;

// double positive = countpos(arr);
// double posit = (positive / d);

// double negative = countneg(arr);
// double negat = negative / d;

// double zeroes = countzero(arr);

// double zer = zeroes / d;

// System.out.println(posit);
// System.out.println(negat);
// System.out.println(zer);
// }
// }

// count

// import java.io.*;
// import java.util.*;
// import java.lang.*;

// public class Main {
// public static void main(String[] args) throws java.lang.Exception {

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int arr[] = new int[size];
// int k = sc.nextInt();

// for (int i = 0; i < arr.length; i++) {
// arr[i] = sc.nextInt();
// }

// int cnt = 0;

// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = arr.length - 1; j > i; j--) {
// if (arr[i] - arr[j] == k || arr[i] - arr[j] == -k) {
// cnt++;
// }
// }
// }
// System.out.println(cnt);
// }
// }