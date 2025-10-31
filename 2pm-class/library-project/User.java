class User{

    public static void main(String[] args){
        Library lib = new Library();
        Book bk = lib.issueBook();
        bk.read();
        lib.close();
        
    }
}
    
