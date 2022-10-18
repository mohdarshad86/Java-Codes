public class K21String {

    public static void main(String[] args) {

        String a = "Kunal";
        String b = "Kunal";

        System.out.println(a);
        a = "Kushwaha";
        System.out.println(a);

        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }

}
