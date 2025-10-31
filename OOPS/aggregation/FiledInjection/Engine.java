public class Engine{

    int hp ;
    int strokes;
    String type;

    Engine(){

    }

    Engine(int hp,int strokes,String type){
        this.hp= hp;
        this.strokes = strokes;
        this.type = type;
    }

    public void displayDetails(){
        System.out.println(hp);
        System.out.println(strokes);
        System.out.println(type);
        System.out.println("=================");
    }

    public void start(){
        System.out.println(" start the engine ");
    }
}