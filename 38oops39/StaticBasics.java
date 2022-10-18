public class StaticBasics {
    public static void main(String[] args) {

        StaticBasics obj = new StaticBasics();
        obj.greeting();
        obj.fun2();
    }

    void greeting() {
        // fun();
        System.out.println("Hello");
    }

    void fun2() {
        greeting();
    }
}
