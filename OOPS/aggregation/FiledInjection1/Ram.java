

public class Ram {
    int size;
    String type;

    Ram(){}

    Ram(int size,String type){
        this.size = size;
        this.type = type;
    }

    public void showRam(){
        System.out.println(size);
        System.out.println(type);
    }
}
