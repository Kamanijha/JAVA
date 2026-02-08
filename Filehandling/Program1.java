import java.io.File;

public class Program1 {
    public static void main(String[] args) {
       try {
        File file = new File("hello.text");
        if(file.createNewFile()){
            System.out.println("file is created seccusfully");
        }else{
            System.out.println("file is already exist");
        }
       } catch (Exception e) {
        System.out.println("error occured");
       }
    }
}
