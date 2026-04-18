package MiniProiect;

public class TestArie {
  public  static void main(String[] args) {
        FiguraGeometrica patrat = new Patrat();
        patrat.afiseazaInfoo();
      System.out.println("Aria Patratului este = " + patrat.calculeaAria());
      FiguraGeometrica cerc = new Cerc();
      System.out.println("Aria cercului este = " + cerc.calculeaAria());
      cerc.afiseazaInfoo();

    }
}
