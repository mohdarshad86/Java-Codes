import java.util.ArrayList;

public class K34Dice {
    public static void main(String[] args) {
        Dice("", 4);

        System.out.println();
        System.out.println(DiceArr("", 4));
    }

    static void Dice(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            Dice(p + i, target - i);
        }

    }

    static ArrayList<String> DiceArr(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(DiceArr(p + i, target - i));
        }
        return list;
    }
}
