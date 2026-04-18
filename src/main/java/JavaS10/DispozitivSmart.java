package JavaS10;
abstract class DispozitivSmart {
    private String nume;
    private String producator;
    protected boolean estePornit;

    public DispozitivSmart(String nume, String producator) {
        this.nume = nume;
        this.producator = producator;
        this.estePornit = false;
    }

    // Metoda abstracta: fiecare dispozitiv "reactioneaza" diferit la activare
    public abstract void executaComandaPrincipala();

    public void afiseazaStare() {
        String stare = estePornit ? "PORNIT" : "OPRIT";
        System.out.println("------------------------------------");
        System.out.printf("Dispozitiv: %s (%s) | Stare actuala: %s\n",
                nume, producator, stare);
    }

    public String getNume() { return nume; }
}


