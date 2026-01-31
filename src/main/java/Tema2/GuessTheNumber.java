package Tema2;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        int secret = 7;
        System.out.println("Ghiceste numarul");
        int numarulTau = cititor.nextInt();
        while ( numarulTau != 7) {
        System.out.println("Incearca din nou");
        numarulTau= cititor.nextInt();}
        System.out.println("Felicitari");





    }
}
