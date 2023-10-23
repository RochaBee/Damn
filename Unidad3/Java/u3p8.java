
package com.mycompany.Programa8_U3;
import java.util.Scanner;

public class u3p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo numero es mayor.");
        } else {
            System.out.println("Ambos numeros son iguales.");
        }
    }
}
