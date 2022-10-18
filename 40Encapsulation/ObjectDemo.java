public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // We'll go in detail of how to create it in hashmap lecture

    @Override
    public int hashCode() {
        // return super.hashCode();
        return num; // will give num
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);

        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // @Override //finalize mark for removel
    // protected void finalize() throws Throwable {
    // super.finalize();
    // }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        if (obj1.equals(obj2)) {
            System.out.println("Obj1 is equal to object 2");
        }

        System.out.println(obj1.getClass().getName());

    }
}
