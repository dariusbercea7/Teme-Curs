package JavaS10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CitireVarstaSigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varsta = 0;
        boolean inputValid = false;

        do {
            try {
                System.out.print("Introdu vârsta ta: ");
                varsta = scanner.nextInt();

                if (varsta < 0 || varsta > 120) {
                    throw new IllegalArgumentException("Vârsta trebuie să fie între 0 și 120!");
                }
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("X EROARE: Te rugăm să introduci un număr întreg.");
                scanner.next(); // Curățăm buffer-ul scanner-ului
            } catch (IllegalArgumentException e) {
                System.out.println("X EROARE: " + e.getMessage());
            }
        } while (!inputValid);

        System.out.println("Succes! Vârsta înregistrată: " + varsta);
        scanner.close();
    }
}


