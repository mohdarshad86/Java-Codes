import java.util.Scanner;

public class L10array {
    public static void main(String[] args) {

        // ARRAY INITIALIZE

        // // int[] marks = new int[3];
        // // marks[0] = 97;
        // // marks[1] = 98;
        // // marks[2] = 95;
        // int marks[] = { 97, 98, 95 };

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);

        // }

        // ARRAY IN AND OUTPUT

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // System.out.println(numbers[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Present At index :" + i);

            } else {
                System.out.println("Not");
                break;
            }
        }
    }
}
