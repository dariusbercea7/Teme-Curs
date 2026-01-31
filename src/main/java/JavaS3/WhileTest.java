package JavaS3;

public class WhileTest {
    public static void main(String[] args) {
        int baterie1 = 10;
        while (baterie1 > 0) {
            System.out.println("Telefonul funcționează. Baterie: " + baterie1 + "%");
            baterie1--; // Scădem bateria (FOARTE IMPORTANT pentru a evita bucla infinită)

        }
        System.out.println("Telefon închis.");

        int baterie2 = 0;
        while (baterie2 <= 100) {
            System.out.println("Telefonul se alimenteaza de la retea/priza Baterie: " + baterie2 + "%");
            baterie2++; // Scădem bateria (FOARTE IMPORTANT pentru a evita bucla infinită)
            if (baterie2 == 25) {
                System.out.println("Telefon alimentat la 25%. Pot intrerupe");
                break;
            }
        }
        System.out.println("Telefon alimentat complet");


    }
}
