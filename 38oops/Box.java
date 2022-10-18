//Inheritence Basics part1

public class Box {

    // Let it be a Box(l,h,w)

    double l;
    double h;
    double w;

    public static void main(String[] args) {
        // Box box1 = new Box(4, 7.9, 8.5);
        // Box box2 = new Box(box1);

        // System.out.println(box1.l + " " + box1.h + " " + box1.w);
        // System.out.println(box2.w); // 8.5

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box3.h + " " + box3.weight);

        // Box box5 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box5.w);

        // There are many variable in both parent and child class
        // you are given access to variable those are in the ref type
        // hence you should have access to weight variable
        // This aslo means that the ones youre trying to access should be initialised
        // but here when the object itself if of type parent, how will you call the
        // weight
        // that is why error
        // BoxWeight box6=new Box(); ERROR

        BoxPrice box7 = new BoxPrice(5, 8, 200);
        System.out.println(box7.cost);
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // let cube
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

}

class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = -1;

    }

    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;

    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;

    }

    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w); // what is this thing? call the parent class constructor
        // used to initialise values present in parent class

        System.out.println(this.w);
        // or
        System.out.println(super.w); // ek hi baat

        this.weight = weight;
    }
}

class BoxPrice extends BoxWeight {
    
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}