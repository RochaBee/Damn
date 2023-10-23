package com.mycompany.Programa7_U3;
import java.util.Scanner;

public class u3p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 27) {
            System.out.println("Hace calor.");
        } else if (temperatura > 20 && temperatura <= 27) {
            System.out.println("Clima agradable.");
        } else {
            System.out.println("Clima fresco o fri­o.");
        }
    }
}
