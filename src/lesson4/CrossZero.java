package lesson4;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;

import java.util.Random;
import java.util.Scanner;

public class CrossZero {
    static final int SIZE_X = 5;
    static  final int SIZE_Y = 5;
    static final int RATE = 4;

    static char field [][] = new char[SIZE_X][SIZE_Y];

    static final char PLAYER_DOT ='X';
    static final char AI_DOT = '0';
    static final char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    private static void initFieald() {
        for (int i=0; i<SIZE_Y;i++) {
            for (int j=0;j<SIZE_X;j++){
                field[i][j]=EMPTY_DOT;
            }
        }
    }

    private static void printFieald() {
        System.out.print("  ");
        for (int k=0;k<SIZE_X;k++){
            System.out.printf("%d ",k+1);
        }
        System.out.println("");
        for (int i=0; i<SIZE_Y;i++) {
            System.out.printf ("%d║",i+1);
            for (int j=0;j<SIZE_X;j++){
                System.out.print(field[i][j]+"║");
            }
            System.out.println("");
        }

    }


    private static void setSymbol (int y, int x, char symbol){
        field[y][x]=symbol;
    }


    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }


    private static void playerStep(){
        int x;
        int y;
        do{
            System.out.println ("Введите ккоридинаты для хода");
            y=scanner.nextInt()-1;
            x=scanner.nextInt()-1;

        } while (!isCellValid(y,x));
        setSymbol(y,x,PLAYER_DOT);
    }


    private static void aiStep() {   // Я сломал Голову. Что только не пробова. Все не то. Нашел теорию
        int x;                       // графов для решения этой эадачи. Но думаю - это уж слишком.
        int y;
      //  int s;
      //  int m;

         do {

                 x = random.nextInt(SIZE_Y);
                 y = random.nextInt(SIZE_X);
               //  s=x;
              //   m=y;

          } while (!isCellValid(y,x)); //&& (field[y][x]) == PLAYER_DOT)) ;

        setSymbol(y,x,AI_DOT);

    }


    private static boolean isDraw() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if(field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean chekWin (char clone){
        int yVerticalCounter = 0;
        int xGorizontCounter = 0;
        int x1DiagCounter = 0;
        int x2DiagCounter = 0;
        int i;
        int j;
        int k;

        for (i=0;  i<field.length; i++) {
            for (j = 0; j < field.length; j++)  {
                if (field[i][j] == clone) ++xGorizontCounter;
                if (field[j][i] == clone) ++yVerticalCounter;
                if (field[j][j] == clone)  ++x1DiagCounter;
                if (field[j][field.length-1-j]==clone) ++x2DiagCounter;

            }
              if (xGorizontCounter == RATE) {
                  return true;
              } else xGorizontCounter=0;

              if (yVerticalCounter == RATE) {
                  return true;
              } else  yVerticalCounter= 0;

              if (x1DiagCounter == RATE) {
                return true;
              } else  x1DiagCounter= 0;

              if (x2DiagCounter == RATE) {
                  return true;
              } else  x2DiagCounter = 0;

        }

        int add1DiagCounter = 0;
        int add2DiagCounter = 0;
        int add3DiagCounter = 0;
        int add4DiagCounter = 0;

            for (j=0,i=1;i<field.length;j++,i++) {
                if (field[i][j] == clone) ++add1DiagCounter;
                if (field[j][i] == clone) ++add2DiagCounter;
                if (field[i][field.length-j-1] == clone) ++add3DiagCounter;
                if ((field[j][field.length-i-1]) == clone) ++add4DiagCounter;
            }
             if (add1DiagCounter == RATE) {
                 return true;
             } else add1DiagCounter = 0;

             if (add2DiagCounter == RATE) {
                 return true;
             } else add2DiagCounter = 0;

             if (add3DiagCounter == RATE) {
                 return true;
             } else add3DiagCounter = 0;

             if (add4DiagCounter == RATE) {
                 return true;
             } else add4DiagCounter = 0;

        return false;
    }


    public static void main (String[] args){
        initFieald();
        printFieald();

        while (true) {
            playerStep();
            printFieald();
            if (chekWin(PLAYER_DOT)) {
                System.out.println ("You win!");
                break;
            }

            if (isDraw()) {
                System.out.println ("DRAW");
                break;
            }

            aiStep();
            printFieald();
            if(chekWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if(isDraw()) {
                System.out.println("DRAW");
                break;
            }

        }
    }

}
