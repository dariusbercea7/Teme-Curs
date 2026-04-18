package JavaS9;

public class ExceptionsTest {
    public static void main(String[] args) {
//        double division;
//        double operand1 = 20;
//        double operand2 = 0;
//
//        division = operand1 / operand2;
//
//        System.out.println(" Rezultatul impartirii este: " + division);

        try {
            int rezultat = 10 / 0; // Aceasta va genera o exceptie
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Eroare: Nu poti imparti un numar la zero!");
        } finally {
            System.out.println("🏁 Operatiune incheiata (succes sau esec).");
        }
    }
}
