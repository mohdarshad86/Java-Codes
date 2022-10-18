import java.util.Arrays;

public class CustomGenericArrList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenericArrList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current item in the new Array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {

        return Arrays.toString(data) + " of Size(Added item): " + size;
    }

    public static void main(String[] args) {
        CustomGenericArrList<Integer> list = new CustomGenericArrList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}
