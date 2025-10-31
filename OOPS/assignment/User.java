class User{

    String name;
    String email;
    int password;
    int age ;

    public void setDetails(String a, String b, int c, int d){
        name = a;
        email = b;
        password = c;
        age = d;
    }

    public String getDetails(){
        return "user name is :" + name + "\n email is : " + email + "\n password is :" +password+ "\n age is : " + age + "\n=======";
    }
}