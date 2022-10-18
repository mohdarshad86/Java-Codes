import java.util.Arrays;

public class K21Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";

        System.out.println(Arrays.toString(name.toCharArray())); // Str to Array

        System.out.println(name.toLowerCase()); // to lowecase

        System.out.println(name.indexOf('a')); // ind of a=3

        System.out.println("Kunal Kushwaha Hello World".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
