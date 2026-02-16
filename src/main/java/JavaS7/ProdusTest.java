package JavaS7;

public class ProdusTest {
     public static void main(String[] args) {
        Produs produs = new Produs("Lapt", 10);
        System.out.println("Prodsul este " + produs.getTipProdus() + " " + produs.getPret());
    }
}
