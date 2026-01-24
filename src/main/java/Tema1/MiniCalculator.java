package Tema1;
import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {


        Scanner cititor = new Scanner(System.in);
        System.out.println("Care este primul numar?");
        double nr1 = cititor.nextDouble();
        System.out.println("Care este al doilea numar numar?");
        double  nr2= cititor.nextDouble();
        System.out.println("+, -, *, / ");
        char x=cititor.next().charAt(0);

        double result =0;
        if (x == '+'){
            result = nr1 + nr2;
        }
        if (x == '-'){
            result = nr1 - nr2;
        }
        if (x == '*'){
            result = nr1 * nr2;
        }
        if (x == '/'){
            result = nr1 / nr2;
        }
        System.out.println(result);





























    }
}