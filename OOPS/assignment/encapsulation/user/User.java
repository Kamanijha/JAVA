class User{

    private int age;

    public void setAge(int age){
        if(age >= 18 && age <= 65){
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }

    public int getAge(){
        return age;
    }
}