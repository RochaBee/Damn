package com.mycompany.Programa6_U3;
import java.util.Scanner;

public class u3p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es un numero par.");
        } else {
            System.out.println("Es un numero impar.");
        }
    }
}
