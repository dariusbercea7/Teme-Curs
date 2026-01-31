package JavaS2;

import java.util.Scanner;

public class ConvertorValutar {
    public static void main(String[] args) {
        // CONSTANTĂ: Valoarea nu poate fi schimbată accidental în restul codului
        final double CURS_RON_EUR = 4.98;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți suma în RON: ");
        double sumaRON = scanner.nextDouble();

        double sumaEUR = sumaRON / CURS_RON_EUR;

        // %.2f limitează afișarea la exact 2 zecimale
        System.out.printf("Suma de %.2f RON este echivalentă cu %.2f EUR.\n", sumaRON, sumaEUR);

        scanner.close();
    }
}
