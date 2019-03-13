package lesson5;

import java.util.Arrays;
import java.util.Random;


public class AddTask {

    static Random random = new Random();

    private static void fill  (int[] array, int n){
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(n);
        }
    }

    private static void ForestNote (int array [], int n ){
        int [] counter = new int [n];
        int gr=0;

        for (int i=0; i<n; i++){                                 // Сравниваем и считаем одинак. элементы массива, дубли
            for (int j=0; j<n-1; j++){                           // затираем лубым числом != N (по усл. задачи)
                                                                 //в нашем случае 35.
                    if (array[i]==array[j]) {
                            counter[i]++;
                            if (counter[i]>1) array[j]=35;
                    }
            }

        }


        for (int i =0; i<n; i++){                                 //выводим то что нам нужно по условию задачи.
            if (array[i]!=35) {
                System.out.print(counter[i] + " ");
            }
        }

    }


    public static void main(String[] args) {
        final int M = 20;
        final int N = 20;
        int[] forest = new int[M];

        fill(forest,N);
        System.out.println(Arrays.toString(forest));

        ForestNote(forest,M);

        }

    }







