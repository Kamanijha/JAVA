class Engine{
    int hp;
    int strokes;
    String type;
    
    Engine(){

    }
    Engine(int hp,int strokes,String type){
        this.hp = hp;
        this.strokes = strokes;
        this.type = type;
    }

    public void start(){
        System.out.println("engine start");
    }

    public void showDetails(){
        System.out.println(hp);
        System.out.println(strokes);
        System.out.println(type);
    }
}