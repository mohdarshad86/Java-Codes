
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class L4Palindrome {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int temp = n;
//         int sum = 0;

//         while (n > 0) {
//             int lastd = n % 10;
//             sum = sum * 10 + lastd;
//             n /= 10;
//         }
//         if (temp == sum) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }

//Armstrong number
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        while (n > 0) {
            int lastd = n % 10;
            sum = sum + (lastd * lastd * lastd);
            n /= 10;
        }
        if (sum == org) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
