class FruitDriver{

    public static void main(String[] args){

        System.out.println("=========program start==========");
        Fruit v1 = new Fruit();
        Fruit v2 = new Fruit();
        Fruit v3 = new Fruit();

        v1.setDetails(24 , 34.5 , "mango");
        v2.setDetails(23 , 120.0 , "apple");
        v3.setDetails(24 , 60.5 , "banana");

        String details1 = v1.getDetails();
        String details2 = v2.getDetails();
        String details3 = v3.getDetails();
        System.out.println(details1);
        System.out.println(details2);
        System.out.println(details3);
    }
}