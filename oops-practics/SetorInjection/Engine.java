

public class Engine {
    int hp;
    int stroke;
    String type;

    Engine(){}
    Engine(int hp,int stroke,String type){
        this.hp = hp;
        this.stroke = stroke;
        this.type = type;
    }

    public void showDetails(){
        System.out.println(hp);
        System.out.println(stroke);
        System.out.println(type);

    }
}
