import java.util.HashMap;
import java.util.Scanner;

public class h3commonEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n1];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> fmap = new HashMap<>();

        for (int val : a1) {
            if (fmap.containsKey(val)) {
                int oldf = fmap.get(val);
                int newf = oldf + 1;
                fmap.put(val, newf);
            } else {
                fmap.put(val, 1);
            }
        }

        for (int val : a2) {
            if (fmap.containsKey(val)) {
                System.out.println(val);
                fmap.remove(val);

            }
        }

    }
}
