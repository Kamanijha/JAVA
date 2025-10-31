class ProductDriver{
   
    public static void main(String[] args){
        Product p1 = new Product();
         Product p2 = new Product();
          Product p3 = new Product();

        p1.setDetails("shirt" , "Blackberrys2" , 42);
        p2.setDetails("shirt" , "Blackberrys23" , 46);
        p3.setDetails("shirt" , "Blackberrys45" , 44);

        String details1 = p1.getDetails();
        String details2 = p2.getDetails();
        String details3 = p3.getDetails();
        System.out.println(details1);
        System.out.println(details2);
        System.out.println(details3);
    }
     

}