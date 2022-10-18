import java.util.ArrayList;

public class K21Outputs {
    public static void main(String[] args) {

        // System.out.println("56");

        System.out.println('a' + 'b'); // ASCII 97+98=195

        System.out.println((char) ('a' + 3)); // d

        System.out.println("a" + 1);

        System.out.println("Kunal" + new ArrayList<>());

        String ans = 56 + "  " + new ArrayList<>();
        System.out.println(ans);

        String series = "";

        // performance
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            // System.out.print(ch + " ");

            series = series + ch;
        }
        System.out.println(series);

    }
}
