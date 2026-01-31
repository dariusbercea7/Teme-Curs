package JavaS3;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // E par? Sări peste el, nu executa codul de mai jos, treci la i++
            }
            System.out.println("Număr impar: " + i);

        }
}}
