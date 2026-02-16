package JavaS3;

public class MeniuInteractiv {
    public static void main(String[] args) {
        int optiune = 1;
        switch (optiune) {
            case 1 -> System.out.println("Jocul începe...");
            case 2 -> System.out.println("Deschidem setările...");
            case 3 -> System.out.println("La revedere!");
            default -> System.out.println("Opțiune invalidă.");
        }
    }
}
