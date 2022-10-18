import java.util.Scanner;

public class L3Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("Sum is :");
        System.out.println(sum);

        // HW Circle area

        int r = sc.nextInt();

        double cf = 2 * 3.14 * r;

        double area = 3.14 * r * r;

        System.out.println(cf);
        System.out.println(area);

        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(table * i);
            System.out.print(" ");

        }
        sc.close();
    }
}
