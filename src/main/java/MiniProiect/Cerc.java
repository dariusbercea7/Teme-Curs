package MiniProiect;

public class Cerc extends FiguraGeometrica {
    private double R = 2 ;
    @Override
    public double calculeaAria() {
        double A = Math.PI * R * R;
        return A;
    }

    @Override
    public void afiseazaInfoo() {
        System.out.println("Acesta este un cerc");
    }
}
