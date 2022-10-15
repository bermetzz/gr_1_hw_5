public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setDamage(50);
        boss.setHealth(500);
        boss.setProtectionType("Magical");
        System.out.println("health: "+boss.getHealth()+"; damage: "+boss.getDamage()+
                "; protection type: "+boss.getProtectionType());

        Hero[] arr=createHeroes();
        for(Hero h:arr){
            System.out.println("hero's damage: "+h.getDamage()+"; hero's health "+h.getHealth()+
                    "; hero's superpower "+h.getSuperpower());
        }
    }

    public static Hero[] createHeroes(){
        Hero firstHero=new Hero(230, 40);
        Hero secondHero=new Hero(220, 20, "Kinetic");
        Hero thirdHero=new Hero(215, 25, "Physical");
//        Hero[] heroes={firstHero, secondHero, thirdHero};
//        return heroes;
        return new Hero[]{firstHero, secondHero, thirdHero};
    }

}
