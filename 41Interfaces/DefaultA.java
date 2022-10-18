public class DefaultA implements A, B {

    // @Override
    // public void fun() {
    // // TODO Auto-generated method stub

    // }

    @Override
    public void greet() {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        DefaultA obj = new DefaultA();
        A.greeting();
    }

}

interface A {

    // static interface method should have a body
    // call via the interface name
    static void greeting() {
        System.out.println("I am in static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}

interface B {
    void greet();

    // void fun();
}