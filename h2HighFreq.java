import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.html.FormView;

public class h2HighFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int oldf = hm.get(ch);
                int newf = oldf + 1;
                hm.put(ch, newf);
            } else {
                hm.put(ch, 1);
            }
        }

        char maxfchar = str.charAt(0);
        for (char key : hm.keySet()) {
            if (hm.get(key) > hm.get(maxfchar)) {
                maxfchar = key;
            }
        }
        System.out.println(maxfchar);
    }

}
