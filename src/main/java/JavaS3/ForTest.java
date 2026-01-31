package JavaS3;

public class ForTest {
    public static void main(String[] args) {
        //     (START)    (STOP)    (PAS)
        for (int i = 10; i >= 0; i--) {
            System.out.println("Facem flotarea numărul " + i);
            if (i==5) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Beep!");
                }
            }
        }


    }
}
