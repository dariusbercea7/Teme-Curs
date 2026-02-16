package JavaS7;

class ContBancar {
    private String titular;
    private double sold;

    public ContBancar(String titular, double sumaInitiala) {
        this.titular = titular;
        this.sold = (sumaInitiala >= 0) ? sumaInitiala : 0;
    }

    public double getSold() { return sold; }

    public void depunere(double suma) {
        if (suma > 0) this.sold += suma;
    }

    public void retragere(double suma) {
        if (suma > 0 && suma <= this.sold) {
            this.sold -= suma;
            System.out.println("✅ Retragere reusita.");
        } else {
            System.out.println("❌ Fonduri insuficiente.");
        }
    }
}

