//public package shapeBasedProject;

public class Rectangle {
     double l;
     double w;
    Rectangle(){

    }

    Rectangle(double l,double w){
        if(l>0 && w>0){
            this.l = l;
            this.w = w;
        }else if(l>0){
            this.l = l;
            System.out.println("invalid width plz enter valid width");
        }else if(w>0){
            this.w = w;
            System.out.println("invalid length plz enter valid length");
        }else{
             System.out.println("invalid length  and width entered");
        }
    }

    public String getDetails(){
        return "length is : "+ l + "\nwidth is :" + w;
    }

     public double getArea(){
        return l*w;
     }

     public double getParameter(){
        return 2*(l+w);
     }
}

