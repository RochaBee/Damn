package com.mycompany.u3p19;
import java.util.Scanner;
public class U3p19 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a evaluar:");
        int cantidadNumeros = n.nextInt();
        int cero = 0, mayores = 0, menores = 0;
        for(int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese un número:");
            int numero = n.nextInt();
            if(numero == 0) {
                cero++;
            } else if(numero > 0) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Cantidad de ceros: " + cero);
        System.out.println("Cantidad mayores a cero: " + mayores);
        System.out.println("Cantidad menores a cero: " + menores);
    }
}
