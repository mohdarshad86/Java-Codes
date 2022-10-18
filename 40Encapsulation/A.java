
import java.util.ArrayList;

public class A {
    protected int num;
    public String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        A obj = new A(34, "Kunal");

        obj.getNum();

        // need to do a few things
        // 1.access the data member
        // 2.modify the data member

        ArrayList<Integer> list = new ArrayList<>();

    }

}

class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Kushwaha");

        int n = obj.num;
    }
}
