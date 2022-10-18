public class Shapes {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        circle.area(); // Are of circle
        square.area(); // area of square
        shape.area();//I am in shape
    }

    void area() {
        System.out.println("I am in shape");
    }

    //early binding: Check notes
//    final void area() {
//         System.out.println("I am in shape");
//     }
}

class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi*r*r");
    }
}

class Square extends Shapes {
    void area() {
        System.out.println("Area is side*side");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("Area is 0.5*b*h ");
    }
}
