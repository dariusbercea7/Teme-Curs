package MiniProiect;

  class Patrat extends FiguraGeometrica {
    private double L = 6;
      @Override
     public double  calculeaAria() {
         double A =  L * L;
         return A;
      }
      @Override
      public void afiseazaInfoo() {
          System.out.println("Acesta este un patrat" );
      }
  }







