

public class StudentController {
    public static void main(String[] args) {
        
        StudentService  student = new StudentService();

        AddressService ad = new AddressService("patna","india","kamani");
        student.address= ad;  // filed injection
        student.address.getAddress();
    }
}
