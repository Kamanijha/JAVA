class Engine{

    int strokes;
    int hp;
    String type;


    Engine(int strokes,int hp,String type){
        this.strokes = strokes;
        this.hp = hp;
        this.type = type;
    }

    public void displayDetails(){
        System.out.println("strokes : "+strokes);
        System.out.println("hp : "+hp);
        System.out.println("type : "+type);
        System.out.println("=======================");
    }
}