import java.util.Arrays;

public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name; //ab sout a 'kunal' dega random value nhi
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(Arrays.toString(new int[] { 1, 2, 3 }));

        System.out.println(a); // any random value

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
