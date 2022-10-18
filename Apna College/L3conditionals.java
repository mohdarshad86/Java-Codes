import java.util.Scanner;

public class L3conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter valid operator");
        }
        // int a = 9;
        // if (a == 9) {
        // a = 8;
        // System.out.println(a);
        // }
    }
}
