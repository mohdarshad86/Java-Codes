import java.util.Scanner;

public class ArrayPattern {
    public static void main(String[] args) {
        int i, j, k, rows = 5;
        Scanner sc = new Scanner(System.in);
        // rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = rows - i + 2; j <= rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = rows; i >= 1; i--) {
            for (j = rows - i + 2; j <= rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
