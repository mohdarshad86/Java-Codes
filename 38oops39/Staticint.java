
// THIS is a demo to show intializaton of static var

public class Staticint {
    static int a = 4;
    static int b;

    static {
        System.out.println("In Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        Staticint obj = new Staticint();
        System.out.println(Staticint.a + " " + Staticint.b);
    }
}
