public abstract class Parent {
    abstract void career();

    abstract void partner();

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("Hey");
    }

    void normal() {
        System.out.println("Normal method");
    }

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();

        // Parent mom=new Parent(45); not allowed

        Parent.hello();

        son.normal();
    }
}

class Son extends Parent {
 
    public Son(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Ironman");
    }
}

class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be Coder");
    }

    @Override
    void partner() {
        System.out.println("I love pepperpotss");
    }
}