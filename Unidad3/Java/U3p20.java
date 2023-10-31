package com.mycompany.u3p20;
import java.util.Scanner;

public class U3p20 {

    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial del ahorro:");
        double ahorroDiario = ah.nextDouble();
        double ahorroAnual = ahorroDiario;
        for(int dia = 2; dia <= 365; dia++) {
            ahorroDiario *= 3;
            ahorroAnual += ahorroDiario;
        }
        System.out.println("Ahorro anual: " + ahorroAnual);
    }
}
