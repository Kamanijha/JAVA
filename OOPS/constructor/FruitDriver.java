class FruitDriver{

    public static void main(String[] args){
        Fruit.test();   // call method using class  reference 

        Fruit f = new Fruit();
        
        System.out.println(f.x);
        System.out.println(f.y);
    }
}