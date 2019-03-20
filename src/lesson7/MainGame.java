package lesson7;

import java.util.Random;

public class MainGame {

    private static void time (){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {};
    }

    private static int  result (Hero[] pers){
        int sum1;
        sum1=0;
        for (int i = 0; i<pers.length; i++){
            sum1=+pers[i].health;

        }
        return sum1;
    }

    public static void main(String[] args) {
        Random random = new Random();

        Hero[] person = {new Warrior(100, "WarriorWhite", 50),
                new Paladin(80, "PalladinWhite", 80),
                new Bishop(20, "BishopWhite", 20)};
        Hero[] person2 = {new Warrior(100, "WarriorDark", 50),
                new Paladin(80, "PalladinDark", 80),
                new Bishop(20, "BishopDark", 20)};
        int hpsum1 = person[0].health + person[1].health + person[2].health;
        int hpsum2 = person2[0].health + person2[1].health + person2[2].health;


        int i = 0;
        int i2 = 0;



        do {
            i = random.nextInt(3);
            i2 = random.nextInt(3);
            time();
            person[i].info();
            time();
            person[i].hit(person2[i2]);
            time();
            person2[2].healing(person2[random.nextInt(3)]);
            time();
            i = random.nextInt(3);
            i2 = random.nextInt(3);
            person2[i].info();
            time();
            person2[i].hit(person[i2]);
            time();
            person[2].healing(person[random.nextInt(3)]);
            hpsum1 = person[0].health + person[1].health + person[2].health;
            hpsum2 = person2[0].health + person2[1].health + person2[2].health;

            if ((hpsum1 <= 0) || (hpsum2 <= 0)) break;


        } while (true);


        if (result(person)>result(person2)){
            System.out.println("Победила первая (White)  команда");
        } else {
            System.out.println("Победила вторая (Dark) команда");
        }


    }

}