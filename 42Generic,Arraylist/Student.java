import java.util.Arrays;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);

        // if diff=0 means both equal
        // if diff<0 means o is bigger else o is smaller

        return diff;
    }

    @Override
    public String toString() {
        return marks + " " + rollno;
    }

    public interface GenericInterface<T> {
        void display(T value);
    }

    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.25f);
        Student arpit = new Student(2, 95.76f);
        Student karan = new Student(13, 77.55f);
        Student sachin = new Student(9, 96.26f);

        Student[] list = { kunal, rahul, arpit, karan, sachin };
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // if (kunal.compareTo(rahul) < 0) {
        // System.out.println(kunal.compareTo(rahul));
        // System.out.println("Rahul has more marks");
        // }
    }
}
