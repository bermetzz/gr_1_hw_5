public class Hero {
    private int health;
    private int damage;
    private String superpower;

   public Hero(int health, int damage, String superpower) {
       this.health = health;
       this.damage = damage;
       this.superpower = superpower;
   }

   public Hero(int health, int damage){
        this.health=health;
        this.damage=damage;
   }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
