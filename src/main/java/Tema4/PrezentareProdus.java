package Tema4;

public class PrezentareProdus {
   public static void main(String[] args) {
        Produs produs = new Produs("Controller", 300.99 , 7);
        produs.setPret (-100);
        produs.setStoc(-50);
       System.out.println("Produsul tau este :  " + produs.getNumeProdus() + " Pretul : " + produs.getPret() + " Nr stoc : " + produs.getStoc()) ;
       produs.prezentareProdus();
    }


}
