

public class User {
    public static void main(String[] args) {
        Game g = new Game();
        //System.out.println(g.selectWeapon());
        Weapon w = g.selectWeapon();    // this line for upcasting 
        w.use();       // method overrinding

        // if not use method overridnig 
        // if(w instanceof Knife){
        //     Knife k = (Knife) w;
        // } else if(w instanceof Gun){
        //     Gun k = (Gun) w;
        // }else if(w instanceof Bomb){
        //     Bomb b = (Bomb) w;
        // }
    }
}
