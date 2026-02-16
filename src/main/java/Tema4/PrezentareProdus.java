package Tema4;

public class PrezentareProdus {
   public static void main(String[] args) {
        Produs produs = new Produs("Controller", 300.99 , 7);
        produs.setPret (225);
        produs.setStoc(2);
       System.out.println("Produsul tau este :  " + produs.getNumeProdus() + " Pretul : " + produs.getPret() + " Nr stoc : " + produs.getStoc()) ;
    }

}
