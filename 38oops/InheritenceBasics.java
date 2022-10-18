public class InheritenceBasics {

    //Let it be a Box(l,h,w)

    double l;
    double h;
    double w;

    InheritenceBasics(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //let cube
    InheritenceBasics(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    InheritenceBasics( double l,double h,double w){
        this.h= h;
        this.l= l;
        this.w= w;
    }

}
