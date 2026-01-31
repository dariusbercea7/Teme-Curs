package JavaS2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceți primul număr: ");
        double nr1 = cititor.nextDouble();

        System.out.print("Introduceți al doilea număr: ");
        double nr2 = cititor.nextDouble();

        System.out.print("Introduceți operatorul (+, -, *, /): ");
        // Citim primul caracter din input-ul utilizatorului
        char operator = cititor.next().charAt(0);

        double rezultat = 0.0;
        boolean operatieValida = true;

        if (operator == '+') {
            rezultat = nr1 + nr2;
        } else if (operator == '-') {
            rezultat = nr1 - nr2;
        } else if (operator == '*') {
            rezultat = nr1 * nr2;
        } else if (operator == '/') {
            if (nr2 != 0) {
                rezultat = nr1 / nr2;
            } else {
                System.out.println("Eroare: Împărțirea la zero nu este permisă!");
                operatieValida = false;
            }
        } else {
            System.out.println("Eroare: Operator invalid!");
            operatieValida = false;
        }

        if (operatieValida) {
            System.out.printf("Rezultat: %.2f %c %.2f = %.2f\n", nr1, operator, nr2, rezultat);
        }
        cititor.close();
    }
}