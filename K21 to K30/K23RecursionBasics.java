public class K23RecursionBasics {
    public static void main(String[] args) {
        int n = 7;

        // print(n); //0 to 7

        // System.out.println(fibonacci(n)); // 13

        for (int i = 0; i < 11; i++) {
            System.out.print(fiboFormula(i) + " ");
        }
        System.out.println();

        System.out.println(fiboFormula(50));
    }

    static void print(int n) {

        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }

    static int fibonacci(int n) {

        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int fiboFormula(int n) {
        // DIRECT FORMULA

        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)
                - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
