package lesson7;

public class Paladin extends Hero {

    public Paladin(int health, String type, int damage) {
        super(health, type, damage);
    }

    @Override
    void hit(Hero h) {
        if (this.health<=0) {
            System.out.println(this.type + " Мёртв и не может совершить удар");
        } else {
            System.out.println(this.type + " Наносит удар " + this.damage + " единиц " + h.type);
            h.causeDamage(damage);
        }
    }


    @Override
    void healing(Hero h) {
        System.out.println("Паладины  не умеют лечить!");
    }
}
