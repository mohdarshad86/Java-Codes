public class NestedInterfaces {
    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.isOdd(9));
    }
}

class A {
    // nested interface

    public interface NestedInterFace {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterFace {

    @Override
    public boolean isOdd(int num) {

        return ((num & 1) == 1); // (num % 2 == 1);
    }

}
