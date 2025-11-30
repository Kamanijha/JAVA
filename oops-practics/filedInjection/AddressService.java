

public class AddressService {
    String city;
    String country;
    String name;
    AddressService(){

    }

    AddressService(String city,String country,String name){
        this.city = city;
        this.country = country;
        this.name = name;
    }

    public void getAddress(){
        System.out.println(city);
        System.out.println(country);
        System.out.println(name);
    }
}
