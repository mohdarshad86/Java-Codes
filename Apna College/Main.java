import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum = sum + ((x + 1) * (x + 1)) - (3 * x + 1) + x;
        }
        System.out.println(sum);
    }
}