//package shapeBasedProject;

public class Circle {
    double r;
    Circle(){}
    Circle(double r){
        if(r>0){
            this.r = r;
        }else{
            System.out.println("invalid radius");
        }
    }

    public String getDetails(){
        return "radius is : " +r;
    }

    public double getArea(){
        return 3.14*r*r;
    }
    public double getParameter(){
        return 2*3.14*r;
    }
}
