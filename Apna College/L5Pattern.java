import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class L5Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        sc.close();
        // 2
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // // CELL (i,j)
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print(" " + " ");
        // }
        // }
        // System.out.println();
        // }

        // // 3

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 4

        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 5
        // for (int i = 1; i <= n; i++) {
        // // inner loop space print
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // // another loop for star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 6
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // 7
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // 8
        // int cnt = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(cnt + " ");
        // cnt++;
        // }
        // System.out.println();

        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }

    }
}