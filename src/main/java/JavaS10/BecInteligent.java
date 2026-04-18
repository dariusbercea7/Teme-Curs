package JavaS10;
class BecInteligent extends DispozitivSmart {
    private int intensitateLumina; // 0 - 100

    public BecInteligent(String nume, String producator) {
        super(nume, producator);
        this.intensitateLumina = 0;
    }

    @Override
    public void executaComandaPrincipala() {
        this.estePornit = true;
        this.intensitateLumina = 100; // Lumina maxima la activare
        System.out.println("[LIGHT] " + getNume() + " s-a aprins la intensitate maxima.");
    }
}


