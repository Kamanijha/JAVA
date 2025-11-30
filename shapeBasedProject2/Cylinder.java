package shapeBasedProject2;

public class Cylinder implements ThreeDShape{

    double r;
    double h;

    Cylinder(double r,double h){
        if(r > 0){
            this.r = r;
        }else{
            System.out.println("radius must be positive ");
        }

        if(h>0){
            this.h = h;
        }else{
            System.out.println("hight must be positive");
        }
    }

    public double getVolume(){
        return Math.PI*r*r*h;
    }

    public double getLateralSurfaceArea(){
        return 2*Math.PI*r*h;
    }

    public double getTotalSurfaceArea(){
        return 2 *Math.PI*r*(r+h);
    }
    
}
