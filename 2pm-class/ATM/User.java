class User{

    public static void main(String[] args){

        Bank b = new Bank();
        Money m1 = b.a.insertCard();
        m1.use();
    }
}