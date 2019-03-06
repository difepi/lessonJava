package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main_DZ {
    public static void main(String[] args) {
        System.out.printf (" 1. Написать программу, которая загадывает случайное число от 0 до 9, \n \t " +
                "и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить \n\t" +
                " больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша\n\t" +
                " выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).\n");

        guessRandom();
    }

    public static void  guessRandom (){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cls = 1;
        int attempt = 0;

        do {
            int xchislo = random.nextInt(9);

            for (int i=1; i<4;i++){
                System.out.printf ("%d Попытка.  Введите число: ",i);
                int chislo = sc.nextInt();
                chislo = rangeChek(chislo,9,0);


                if (chislo==xchislo) {
                    System.out.println (" Вы угадали! ");
                    break;
                } else {
                    if (chislo < xchislo) {
                        System.out.printf (" Загаданное число больше введенного. У Вас осталось %d попытки \n",3-i);
                    } else  {
                        if (chislo > xchislo) {
                            System.out.printf (" Загаданное число меньше введеного. У Вас осталось %d попытки \n",3-i);
                        }

                    }
                }
                attempt = i;
            }
            if  (attempt==3) {
                System.out.printf (" Вы проиграли. Загаданное число было %d \n", xchislo);
            }
            System.out.println ("Повторить игру еще раз? 1 – да / 0 – нет:  ");
            cls = sc.nextInt();

        } while (cls == 1);

        sc.close();
    }
    public static int rangeChek (int x, int max, int min){
        int numrange=x;
        Scanner sc = new Scanner(System.in);

        while ((numrange > max)||(numrange < min)){
            System.out.print (" Введение число не взодит в доипазон от 0 до 9.\n Повторите ввод: ");
            numrange = sc.nextInt();
        }

        return (numrange);

    }

}
