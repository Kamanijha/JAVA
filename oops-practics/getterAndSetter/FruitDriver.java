class FruitDriver{

    public static void main(String [] args){

        Fruit f = new Fruit();
        f.SetDetails("apple",120,"red");
        String res = f.getDetails();
        System.out.println(res);
    }
}