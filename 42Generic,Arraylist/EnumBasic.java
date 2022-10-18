public class EnumBasic {
    enum Week implements A {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;

        // these are enum constant
        // public,static and final
        // since its final you can create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        } // this is not public or protected
          // ony private or default
          // why? we dont want to create new objects
          // this is not the enum concept thats why

        @Override
        public void Hello() {
            System.out.println("How are you");

        }

        // internally: public statuc Week monday=new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.wednesday;
        week.Hello();
        System.out.println(Week.valueOf("monday"));

        // for (Week day : week.values()) {
        // System.out.println(day);
        // }
        // System.out.println(week.ordinal()); // 2
        // m=0, t=1,w=2,th=3 and so on

    }

    public interface A {
        void Hello();
    }
}
