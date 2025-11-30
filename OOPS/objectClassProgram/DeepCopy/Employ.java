
public class Employ implements Cloneable {
    String name;
    int id;
    Address a;

    Employ(String name, int id, Address a) {
        this.name = name;
        this.id = id;
        this.a = a;
    }

    // deep copy
    public Employ clone() throws CloneNotSupportedException {
        Employ e = (Employ) super.clone();// Main Object
        // The new Address Object is created for related object also
        e.a = new Address(this.a.city, this.a.state);// Field to Field Copy
        return e;
    }

}
