package JavaS3;

public class SwitchTest {
    public static void main(String[] args) {
        int ziua = 0;
        switch (ziua) {
            case 1:
                System.out.println("Luni");
                break; // Oprește execuția aici
            case 2:
                System.out.println("Marți");
                break;
            case 3:
                System.out.println("Miercuri"); // Se va afișa asta
                break;
            default:
                System.out.println("Zi invalidă!");
        }



    }
    }

