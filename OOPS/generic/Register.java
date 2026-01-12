

public class Register <T ,U>{
    T t;
    U u;
    Register(T t, U u){
        this.t = t;
        this.u = u;
    }

    // public  String pridetails(T t, U u){
    //     return "first details is " + t +"\n 2nd details is " + u;
    // }

    public  void pridetails(){
        System.out.println( "first details is " + t +"\n 2nd details is " + u);
    }

    public Register<T,U> get(){
        return new Register<T,U>(t, u);
    }
    
}
