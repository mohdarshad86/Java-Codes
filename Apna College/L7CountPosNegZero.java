import java.util.Scanner;

public class L7Functions {

    public static void SumCount(int n, char ch) {

        while (ch != 's') {
            int cntPos = 0, cntneg = 0, cntZero = 0;
            if (n > 0) {

                cntPos++;
            } else if (n < 0) {

                cntneg++;
            } else {

                cntZero++;
            }
        }
        System.out.println("Positive");
        System.out.println(cntPos);

        System.out.println("negative");
        System.out.println(cntneg);

        System.out.println("zeroes");
        System.out.println(cntZero);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        // int b = sc.nextInt();

        // System.out.println(Sum(n));
        SumCount(n, ch);
    }
}
