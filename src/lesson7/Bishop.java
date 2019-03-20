package lesson7;

public class Bishop extends Hero {

    public Bishop(int health, String type, int damage) {
        super(health, type, damage);
    }
    @Override
    void hit (Hero h){
        if (this.health<=0){
            System.out.println(this.type + " Мертв и не может совершить удар");
            } else {
            System.out.println(this.type + " Наносит удар " + this.damage + " единиц " + h.type);
            h.causeDamage(this.damage);
        }

    }

    @Override
    void healing(Hero h) {
        if  (this.health<=0) {
            System.out.println(this.type + " Мёртв и не может лечить");
        } else {
                if ((h.health<=50)&& (h.health>0)){
                h.causeDamage(-20);
                System.out.println(this.type + " Восстановленивает 20 HP для " + h.type);
            }
        }
    }
}
