public class SalutLume {
    // Metoda 'main' este punctul de start al oricărei aplicații Java
    public static void main(String[] args) {
        // Comanda care afișează text în consolă
        System.out.println("Salut, Lume! Primul meu program cu Gradle!");
        int varsta = 21;

        System.out.print("Varsta mea este: " + varsta);

        varsta = 22;
        System.out.print("Varsta mea este: " + varsta);
        double nr1 = 0.1;
        double nr2 = 0.2;
        double suma = nr1 + nr2;
        System.out.println("Suma este: "+ suma);

// exemple pentru operatorul SI &&
        boolean esteMajor = true;
        boolean areBuletinul = true;

        boolean poateVota= esteMajor && areBuletinul;

        System.out.println("Poate vota?" + poateVota);
        // exemple pentru operatorul SAU ||

        boolean mergLaMare = true;
        boolean mergLaMunte = true;

        boolean maDistrez = mergLaMare || mergLaMunte;
        System.out.println("Ma distrez?-->" + maDistrez);

        boolean negatieMaDistrez = !maDistrez;
        System.out.println("Afisam rezultatul negat al lui ma distrez -->" + negatieMaDistrez);







    }

}


