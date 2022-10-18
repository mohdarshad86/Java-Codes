import java.util.ArrayList;

public class K30SubseqRec {
    public static void main(String[] args) {

        // subseq("", "abc");

        System.out.println(SubSeqArr("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> SubSeqArr(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = SubSeqArr(p + ch, up.substring(1));
        ArrayList<String> right = SubSeqArr(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
