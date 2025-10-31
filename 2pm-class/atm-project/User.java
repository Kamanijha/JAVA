class User {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Money cash = atm.withdraw();
        cash.spend();
        atm.off();
    }
}