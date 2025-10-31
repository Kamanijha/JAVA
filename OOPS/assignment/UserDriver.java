class UserDriver{

    public static void main(String[] args){
        User user1 = new User();

        user1.setDetails("kamani" , "kamani@gamil.com" , 12344567, 26);

        String userDetails= user1.getDetails();
        System.out.println(userDetails);
    }
    
}