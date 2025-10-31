class Engine{
    int strokes;
    int hp;
    String type;

    Engine(int strokes,int hp,String type){
        this.strokes = strokes;
        this.hp = hp;
        this.type = type;
    }

    public void  displayDetails(){
        System.out.println(strokes);
        System.out.println(hp);
        System.out.println(type);
        System.out.println("=================");

    }
}