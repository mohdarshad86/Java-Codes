import java.util.Scanner;

public class L6AdvancePat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        // 10 Butterfly
        // 1st part
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // int spaces = 2 * (n - i);
        // for (int k = 1; k <= spaces; k++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // // 2nd part(out of loop)
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // int spaces = 2 * (n - i);
        // for (int k = 1; k <= spaces; k++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //11 Solid Rhombus
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // // spaces
        // System.out.print(" ");
        // }
        // // STARS
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 11(ii) Hollow Rhombus

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {

        // // trailing spaces
        // System.out.print(" ");
        // }
        // if (i == 1 || i == n) {
        // for (int j = 1; j <= n; j++) {

        // // star
        // System.out.print("*");
        // }
        // } else {
        // for (int j = 1; j <= n; j++) {
        // if (j == 1 || j == n) {
        // // star
        // System.out.print("*");
        // } else {

        // // inside space
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // // 12

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {

        // // trailing spaces
        // System.out.print(" ");
        // }
        // // print number
        // for (int j = 1; j <= i; j++) {

        // // print row no. row no. times
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // // 13 Palindrome

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // 1st half number
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // // 2nd half
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 14 Diamond pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
