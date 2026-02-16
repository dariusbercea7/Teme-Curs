package JavaS7;

public class Main {
    public static void main(String[] args) {
        Masina masinaMea = new Masina(); // Instanțiere
        masinaMea.marca = "Dacia";
        masinaMea.anFabricatie = 2004;
        masinaMea.pornesteMotorul();
        Masina masinaMea2 = new Masina();
        masinaMea2.marca = "BMW";
        masinaMea2.anFabricatie = 2016;
        masinaMea2.pornesteMotorul();
    }
}

