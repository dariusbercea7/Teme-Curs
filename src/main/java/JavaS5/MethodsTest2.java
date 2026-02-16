package JavaS5;


public class MethodsTest2  {
    public static double calculeazaPretRedus(double pret, int procent) {
    double reducere = pret * procent / 100;

    return pret - reducere; // Trimite rezultatul înapoi
}

    public static void main(String[] args) {
        System.out.println("Pretul redus este:" + calculeazaPretRedus(300, 60));
    }



}
