package JavaS7;

class Termostat {
    private String locatie;
    private double temperatura;

    public Termostat(String locatie) {
        this.locatie = locatie;
        this.temperatura = 20.0; // Temperatura default
    }

    public void setTemperatura(double tempNoua) {
        // Limitam temperatura intre 5 si 30 de grade din motive de siguranta
        if (tempNoua >= 5 && tempNoua <= 30) {
            this.temperatura = tempNoua;
            System.out.println("✅ Temperatura in " + locatie + " setata la " + temperatura);
        } else {
            System.out.println("❌ Eroare: Temperatura " + tempNoua + " este in afara limitelor (5-30).");
        }
    }

    public double getTemperatura() { return temperatura; }
}

