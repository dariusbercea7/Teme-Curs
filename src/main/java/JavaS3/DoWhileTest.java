package JavaS3;

public class DoWhileTest {
    public static void main(String[] args) {
        int incercari = 4;
        do {
            System.out.println("Conectare la server..." + "incercarea numarul" + incercari);
            incercari++;
        } while (incercari < 3);
    }
}
