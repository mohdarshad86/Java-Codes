import java.util.Scanner;

public class L11_2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[rows][col];

        // INPUT n OUTPUT
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        int x = 5;
        boolean Absent = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println(i + " " + j);
                    Absent = false;

                }
            }
        }
        if (!Absent) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
