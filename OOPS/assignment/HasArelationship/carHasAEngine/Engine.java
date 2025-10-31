class Engine{

    int hp;
	int strokes;
	String type;
	Engine(){
		
	}
	Engine(int hp, int strokes, String type){
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void start() {
		System.out.println("Start Engine");
	}

    public void stop(){
        System.out.println("stop engine");
    }
}