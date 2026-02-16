package JavaS5;

public class StringTest {
    public static void main(String[] args) {
        String cuvant = "Buna";
        System.out.println(cuvant);
        cuvant = "Bine";
        System.out.println(cuvant);

        String salut = "Buna";
        salut.toUpperCase(); // Aceasta creează un "BUNA" nou în memorie, dar nu îl salvează.
        System.out.println(salut); // Va afișa tot "Buna"

         boolean eval = salut.contains("B");
        System.out.println(eval);


// Varianta corectă:
        String salutModificat = salut.toUpperCase();
        System.out.println(salutModificat); // Afișează "BUNA"
    }
}
