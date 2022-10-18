public class ExceptionHandling {

    public static void main(String[] args) {

        int a = 5, b = 0;

        try {
        divide(a, b);

        } catch (Exception e) {
        System.out.println(e.getMessage());
        } finally {
        System.out.println("This will always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Can not divide by zero");

        }
        return a / b;
    }
}

class Demo {
    public static void main(String[] args) {
        ExceptionHandling.divide(3, 0);
    }
}

class myException extends ExceptionHandling{
    
}