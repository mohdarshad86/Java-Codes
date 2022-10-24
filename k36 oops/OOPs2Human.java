import java.lang.reflect.Constructor;

public class OOPs2Human {
    public static void main(String[] args) {
        // int age;
        // String name;
        // int salary;
        // boolean married;

        OOPs2Human kunal = new OOPs2Human(22, "KUshwaha", 10000, false);
        OOPs2Human rahul = new OOPs2Human(34, "Rahul", 15000, true);

        System.out.println(kunal);

    }

    public OOPs2Human(int age, String name, int salary, boolean married) {

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

    }
}
