package Tema1;

import java.util.Scanner;
public class Convertor {
    public static void main(String[] args) {


        Scanner cititor = new Scanner(System.in);
        double EUR = 5.0011;
        System.out.println("Cat vrei sa schimbi?");
        double RON = cititor.nextDouble();
        System.out.println("Suma Euro=" + (RON / EUR));
    }}