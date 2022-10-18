import java.util.ArrayList;

public class K30StringASCII {
    public static void main(String[] args) {
        // subseqAscii("", "abc");

        System.out.println(SubSeqASCIIRet("", "abc"));
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> SubSeqASCIIRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = SubSeqASCIIRet(p + ch, up.substring(1));
        ArrayList<String> second = SubSeqASCIIRet(p, up.substring(1));
        ArrayList<String> third = SubSeqASCIIRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
