package JavaS3;
import java.util.Scanner;
public class VerificareParola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parola;
        do {
            System.out.print("Introduceți parola: ");
            parola = sc.nextLine();
            if (!parola.equals("Java123")) {
                System.out.println("Parola introdusa nu este corecta");
            }
        } while (!parola.equals("Java123"));
        System.out.println("Acces permis!");
    }
}
