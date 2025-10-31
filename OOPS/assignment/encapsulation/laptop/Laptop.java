class Laptop{
    private String name ;
    
    // set method 
    public void setDetails(String name ){
        if(name.matches("[A-Za-z\\s]+")){
            this.name= name;
        }else{
            System.out.println("Invalid name");
        }
    }

    // get method

    public String getDetails(){
        return "Name: " + name ;
    }
}