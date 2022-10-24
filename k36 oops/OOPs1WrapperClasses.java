public class OOPs1WrapperClasses {
    public static void main(String[] args) {
        // int a = 10; // premitive
        // int b = 20;

        // Integer num = 45; // function

        // swap(a, b);
        // System.out.println(a + " " + b); //pr yha nhi

        Integer a = 10;
        Integer b = 20;
        swapped(a, b);
        System.out.println(a + " " + b); // not swap

        final int Bonus = 2;
        // Bonus = 2; cant modify

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "Other name"; // allowed hai

        // when a non-pritive is final you cant reassign it
        // kunal=new A("New object"); not allowed

        A obj;

        for (int i = 0; i < 10; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // System.out.println(a + " " + b); yha swap ho jayega
    }

    static void swapped(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
        // System.out.println(a + " " + b); yha swap ho jayega
    }
}

class A {
    // final int num; //error not initialised

    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Object created");
        this.name = name;
    }

    // @Override
    // protected void finalize() throws Throwable {
    // System.out.println("Object is destroyed");
    // }

}