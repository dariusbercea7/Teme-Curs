package Tema3;

import java.util.Arrays;

public class AnalizaNotelor {
    public static double calculeazaMediaGnerala(int [] date) {
        double suma= 0;
        // enhanced for
        for (int nota : date){
            suma = suma + nota;
            // suma += nota;
        }
        return suma / date.length;
    }
public static int notaMaxima (int[] nota ){

        int maxim= nota[0];
        for (int i = 0; i<nota.length; i++) {
            if (nota[i] > maxim) {
                maxim = nota[i];
            }

    }
    return maxim;
}



   public static void main(String[] args) {
        int[] nota  = {10, 4, 8, 7, 9, 6};




        System.out.println("Media generala este :" + calculeazaMediaGnerala(nota));
       System.out.println("Nota maxima este:" + notaMaxima(nota));

    }

    }




