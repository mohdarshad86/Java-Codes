import java.util.Arrays;

public class K37OOPs1 {
    public static void main(String[] args) {

        // just declaring
        // Student kunal;
        // kunal=new Student();

        // or in one line

        Student kunal = new Student(15, "Kushwaha", 85.4f);

        Student rahul = new Student();

        // kunal.rno = 13;
        // kunal.name = "Kunal Kushwaha";
        // kunal.marks = 89.3f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        // kunal.changeName("shoe lover");
        // kunal.greet();

        Student random = new Student(kunal);
        System.out.println(random.name); // will give kunal.name
                                         // ie kushwaha

        Student random2 = new Student();

        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name); // something something

    }
}

// create a class for every student
class Student {
    int rno;
    String name;
    float marks = 90.0f;

    // we need a way to add the values above
    // prop object by object

    // we need one word to access every object

    // Student() {
    // this.rno = 13;
    // this.name = "Kunal Kushwaha";
    // this.marks = 89.3f;
    // }

    Student() {
        // this is how you call a constructor from another constructor
        // internally it something like : new Student(13,"Default person", 100.0f)
        this(13, "Default person", 100.0f);
    }

    // student arpit=new Student(17,"Arpit", 89.7f);
    // here this will be replaced with arpit

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void greet() {
        System.out.println("Hello name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}
