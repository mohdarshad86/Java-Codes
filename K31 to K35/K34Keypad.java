import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.spi.FormatConversionProvider;

public class K34Keypad {
    public static void main(String[] args) {
        // keypad("", "12");

        System.out.println(KeypadArr("", "12"));

        System.out.println(KeypadCount("", "123"));
    }

    static void keypad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            keypad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> KeypadArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(KeypadArr(p + ch, up.substring(1)));
        }
        return list;
    }

    static int KeypadCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int cnt = 0;

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {

            char ch = (char) ('a' + i);

            cnt = cnt + KeypadCount(p + ch, up.substring(1));
        }
        return cnt;
    }
}
