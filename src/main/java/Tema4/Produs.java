package Tema4;

public class Produs {
    private String numeProdus;
    private double Pret;
    private int Stoc;

    public Produs (String numeProdus, double pret, int stoc ) {
        this.numeProdus = numeProdus;
        this.Pret = pret;
        this.Stoc = stoc;
    }

    public double getPret() {
        return Pret;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public int getStoc() {
        return Stoc;
    }

    public void setPret(double pretNou) {
       if (pretNou > 0){
           this.Pret = pretNou;}
     else {
        System.out.println("Pretul nu poate fi negativ");
    }}

    public void setStoc(int stocNou) {
       if (stocNou > 0) {
           this.Stoc= stocNou;
       }
       else {
           System.out.println("Stoc indisponibil");
       }

    }
     public void prezentareProdus (){
        System.out.println("Produsul tau: " + getNumeProdus() + getPret() + getStoc());
    }
}
