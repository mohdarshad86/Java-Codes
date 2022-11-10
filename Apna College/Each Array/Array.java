public class Array {
    public static void main(String[] args) {

        String[] st = { "Ram", "Lak", "khan", "man" };

        System.out.println(st.length);
        System.out.println(st[1]);

        for (int j = 0; j < st.length; j++) {

            System.out.print(st[j] + " ");
        }
        // or you can do it

        for (String el : st) {
            System.out.println(el);
        }
    }
}