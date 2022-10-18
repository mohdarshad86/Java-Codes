import java.util.Scanner;

public class L8HCF {

    public static int hcf(int a, int b) {

        int rem = Math.min(a, b);

        while (rem > 0) {
            if (a % rem == 0 && b % rem == 0) {
                break;
            }
            rem--;
        }
        return rem;

    }

    public static int Euclid(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return Euclid(a - b, b);
        }
        return Euclid(a, b - a);
    }

    public static int Fibbonaci(int n){

        int t1=0, t2=1;
        
        for(int i=1; i<=n; i++){
           // System.out.println(t1);
            int nxtnum=t1+t2;
            t1=t2;
            t2=nxtNum;
        }
        return t1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println(hcf(a, b));

        System.out.println(Euclid(a, b));

    }
}
