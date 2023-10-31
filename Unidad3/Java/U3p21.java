package com.mycompany.u3p21;
import java.util.Scanner;

public class U3p21 {

    public static void main(String[] args) {
        Scanner cub = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a evaluar:");
        int cantidadNumeros = cub.nextInt();
        for(int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese un número natural positivo:");
            int numero = cub.nextInt();
            int cubo = numero * numero * numero;
            System.out.println("El cubo del número " + numero + " es: " + cubo);
        }
    }
}
