class Driver{

    public static void main(String[] args){
        House h = new House();

        System.out.println("house obj ref is :" + h);
        System.out.println("house obj ref is :" + h.tap);
        Water w= h.tap.on();
        w.drink();
    }
}