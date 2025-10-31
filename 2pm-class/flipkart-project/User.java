class User{

    public static void main(String[] args){

        Flipkart flipkart = new Flipkart();

       flipkart.app.whislist();
       flipkart.app.addToCart();
        Product product = flipkart.app.buy();
        product.use();

    }
}