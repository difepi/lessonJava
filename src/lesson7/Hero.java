package lesson7;

public abstract class Hero {
    protected int health;
    protected String type;
    protected int damage;

    public Hero(int health, String type, int damage) {
        this.health = health;
        this.type = type;
        this.damage = damage;
    }


    abstract void hit(Hero h);
    abstract void healing(Hero h);

   protected void causeDamage(int damage) {
       if (health > 0) {
           health -= damage;
       } else System.out.println(type + " Мертв" + " Промах");

    }
    protected void  info() {
        System.out.println(health + "HP " + type );
    }

}
