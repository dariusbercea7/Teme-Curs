package JavaS5;

public class ArrayTest {
    public static void main(String[] args) {
        // Declarăm un tablou pentru 5 note

        int[] note = new int[5];
// Adăugăm valori la indexul specificat
// ATENȚIE: Indexarea începe de la 0!
        note[0] = 10; // Primul vagon
        note[1] = 8;
        note[4] = 9;  // Ultimul vagon (dimensiune - 1)
        int lungime = note.length;
        System.out.println("Lungimea tabelului este" + lungime);

    }
}
