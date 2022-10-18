import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.print(item * 2 + " ");
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subs = (a, b) -> a - b;

        LambdaFunction myCalc = new LambdaFunction();

        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, product));
        System.out.println(myCalc.operate(5, 3, subs));
    }

    private int operate(int a, int b, Operation op) {
        return op.Operation(a, b);
    }
}

interface Operation {
    int Operation(int a, int b);
}