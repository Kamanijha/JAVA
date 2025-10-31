class Library{
    
    public Book issueBook() {
        Book b = new Book();
        return b;
    }

    public void close() {
        System.out.println("library closed");
    }
}
