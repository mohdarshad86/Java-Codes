public class K27Reclevel1 {

    // 1 printing 1 to n & n to 1
    static void fun(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n); // print first then decrease(5,4,3,2,1)
        fun(n - 1);
        System.out.println(n); // (1,2,3,4,5)
    }

    // 2 factorial
    static int factorial(int n) {

        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
    // 3 sum of digits

    static int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return n + sum(n - 1);
    }

    // 4
    static int sumofDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumofDigits(n / 10);

    }

    // 5 Product of digits
    static int prodOfDigits(int n) {

        if (n % 10 == n) {
            return n;
        }

        return n % 10 * prodOfDigits(n / 10);
    }

    // 6 reverse
    static void reverse(int n) {

        // if (n == 0) {
        // return;
        // }
        // int sum = 0;
        // int lastd = n % 10;

        // sum = sum * 10 + lastd;
        // System.out.print(sum);
        // reverse(n / 10);

        // 2ND METHOD

        if (n < 10) {
            System.out.print(n);
            return;
        }

        System.out.print(n % 10);
        reverse(n / 10);
    }

    // 7 Palindrome

    static int Palindrome(int n, int temp) {

        if (n == 0) {
            return temp;
        }
        temp = (temp * 10) + (n % 10);

        return Palindrome(n / 10, temp);
    }

    // Count Zeroes

    static int CountZeroes(int n, int cnt) {

        if (n == 0) {
            return cnt;
        }

        if (n % 10 == 0) {
            CountZeroes(n / 10, cnt++);
        }
        return CountZeroes(n / 10, cnt);
    }

    public static void main(String[] args) {
        // fun(5);
        // System.out.println(factorial(5));
        // System.out.println(sum(10));
        // System.out.println(sumofDigits(1234));
        // System.out.println(prodOfDigits(1234));
        // reverse(1234);

        // {7 hai yha se // int n = 1234321;
        // int temp = Palindrome(n, 0);

        // if (temp == n) {
        // System.out.println("1");
        // } else {
        // System.out.println("0");
        // yha tk}

        System.out.println(CountZeroes(-304020, 0));

    }
}
