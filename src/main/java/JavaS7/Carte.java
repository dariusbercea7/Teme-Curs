package JavaS7;

class Carte {
    private String titlu;
    private String autor;
    private boolean esteImprumutata;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
        this.esteImprumutata = false; // Implicit este la raft
    }

    public void imprumuta() {
        if (!esteImprumutata) {
            esteImprumutata = true;
            System.out.println("✅ Ai imprumutat: " + titlu);
        } else {
            System.out.println("❌ Cartea este deja la altcineva.");
        }
    }

    public void returneaza() {
        esteImprumutata = false;
        System.out.println("✅ Multumim ca ai returnat: " + titlu);
    }

    public String getStatus() {
        return titlu + " - " + (esteImprumutata ? "Indisponibila" : "Disponibila");
    }
}

