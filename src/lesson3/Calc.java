package lesson3;


import java.util.Arrays;
import java.util.Scanner;


public class Calc {
    static private Scanner in = new Scanner(System.in);


    public static void main (String[]args){
        consoleCalc();
    }

    private static boolean chekString (String string){
        boolean flag = true;
        for (int i=0; i<string.length(); i++) {

            if ((string.charAt(i) <= '9') && (string.charAt(i) >= '0')) {
                flag = false;
            }
            else {
                switch (string.charAt(i)) {
                    case '-':
                        flag = false;
                        break;
                    case '+':
                        flag = false;
                        break;
                    case '*':
                        flag = false;
                        break;
                    case '/':
                        flag = false;
                        break;
                    default:
                        return true;

                }
            }
        }
        return flag;
    }

    private static void consoleCalc() {
        String[] line=  in.nextLine().split(" ");
        for (String res : line) {
            if (chekString(res)) {
                System.out.printf("%s Не является числом и математическим знаком \t", res);
            }
        }

        int result = Integer.parseInt(line[0]);

        for (int i = 0; i < line.length; i++) {
            switch (line[i]) {
                case "+":
                    result += Integer.parseInt(line[i + 1]);
                    break;
                case "-":
                    result -= Integer.parseInt(line[i + 1]);
                    break;
                case "*":
                    result *= Integer.parseInt(line[i + 1]);
                    break;
                case "/":
                    result /= Integer.parseInt(line[i + 1]);
                    break;
            }
        }

        System.out.printf("Результат вычислений = %d", result);
    }

}



