package JavaS7;
public class TestarePOO {
    public static void main(String[] args) {
        System.out.println("=== TEST CONT BANCAR ===");
        ContBancar cont = new ContBancar("Andrei", 100);
        cont.retragere(150); // Test negativ: Ar trebui sa dea eroare
        System.out.println("Sold: " + cont.getSold());

        System.out.println("\n=== TEST BIBLIOTECA ===");
        Carte c1 = new Carte("Java Basics", "Herbert Schildt");
        System.out.println(c1.getStatus());
        c1.imprumuta();
        c1.imprumuta(); // Test negativ: Ar trebui sa spuna ca e deja data
        c1.returneaza();

        System.out.println("\n=== TEST TERMOSTAT ===");
        Termostat t = new Termostat("Sufragerie");
        t.setTemperatura(25);  // Test pozitiv
        t.setTemperatura(45);  // Test negativ (peste limita)
        t.setTemperatura(-10); // Test negativ (sub limita)
        System.out.println("Temp finala: " + t.getTemperatura()); // Ar trebui sa ramana 25
    }
}


