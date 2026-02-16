package JavaS7;
class Produs {
    private double pret; // Nu poate fi accesat direct din exterior
    private String tipProdus;

    public Produs (String tipProdus, double pret) {
         this.pret = pret;
         this.tipProdus = tipProdus;

    }

    // Getter
    public double getPret() {
        return pret;
    }

    public String getTipProdus() {
        return tipProdus;
    }

    // Setter cu validare
    public void setPret(double pretNou) {
        if (pretNou > 0) {
            this.pret = pretNou;
        } else {
            System.out.println("Eroare: Pretul trebuie sa fie pozitiv!");
        }
    }
}


