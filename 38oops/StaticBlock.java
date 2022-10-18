
// THIS is a demo to show intializaton of static var

public class StaticBlock {
    static int a = 4;
    static int b;

    //will only runs ones when the first object is created
    //ie when the classs is loaded for the first time
    static {
        System.out.println("In StaticBlock block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
