

public class Rectangle implements TwoDShape{
    double l;
    double w;

    Rectangle(double l,double w){
        if(l>0 && w >0){
            this.l = l;
            this.w = w;

        }else if(l<0 && w <0){
            System.out.println("length and width must not be negative");
        }else if(l<0){
            System.out.println("length must be postive");
            this.w=w;
        }else if(w <0){
            System.out.println("width must be positive");
            this.l = l;
        }
    }
    public double getArea(){
        return  l*w;
        
    }
    public double getPerimeter(){
        return 2*(l+w);
        
    }
}
