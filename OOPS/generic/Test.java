

public class Test <T>{
    T t;       // T is data type and t is variable we can give any name like obj , a , b ....
    Test(T t){   // this is constructor 
        this.t = t;
    }

    public T getObj(){
        return this.t;
    }
}
