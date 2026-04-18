package JavaS10;
class Termostat extends DispozitivSmart {
    private double temperaturaSetata;

    public Termostat(String nume, String producator) {
        super(nume, producator);
        this.temperaturaSetata = 20.0;
    }

    @Override
    public void executaComandaPrincipala() {
        this.estePornit = true;
        this.temperaturaSetata = 23.5; // Temperatura de confort
        System.out.println("[TEMP] " + getNume() + " a setat temperatura la 23.5 grade.");
    }
}

