import java.lang.reflect.Constructor;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public static void main(String[] args) {

        Human kunal = new Human(22, "KUshwaha", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);

        System.out.println(kunal.age);
        System.out.println(rahul.age);
        System.out.println(Human.population);

    }

    public Human(int age, String name, int salary, boolean married) {

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

    }
}