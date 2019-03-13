package lesson5;

public class Main {

    public static void main(String[] args) {
        Worker[] worker = new Worker[5];
        worker[0] = new Worker("Pisarenko","head physician", 89092377, 540000, 31);
        worker[1] = new Worker("Zelepupin","physiotherapist", 8909777, 10000, 40);
        worker[2] = new Worker("Figulko","masseur", 8909666, 5005660, 25);
        worker[3] = new Worker("Lyaluhin","masseur", 8909666, 5087600, 42);
        worker[4] = new Worker("Staruhin","Assistant chief orderly", 89054396, 5000, 45);

        for (int i = 0; i< worker.length; i++){
          if ( worker[i].getAge()> 40) worker[i].outWorkerInformation();
        }

    }



}
