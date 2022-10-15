public class Boss {
    private int health;
    private int damage;
    private String protectionType;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }
}
