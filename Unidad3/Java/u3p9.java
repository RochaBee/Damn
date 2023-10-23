package com.mycompany.Programa9_U3;
import java.util.Scanner;

public class u3p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora de entrada: ");
        int horaEntrada = scanner.nextInt();
        System.out.print("Ingrese la hora de salida: ");
        int horaSalida = scanner.nextInt();

        int horasEstacionamiento = horaSalida - horaEntrada;
        double costo = 0;

        if (horasEstacionamiento <= 2) {
            costo = horasEstacionamiento * 5.0;
        } else if (horasEstacionamiento <= 5) {
            costo = 2 * 5.0 + (horasEstacionamiento - 2) * 4.0;
        } else if (horasEstacionamiento <= 10) {
            costo = 2 * 5.0 + 3 * 4.0 + (horasEstacionamiento - 5) * 3.0;
        } else {
            costo = 2 * 5.0 + 3 * 4.0 + 5 * 3.0 + (horasEstacionamiento - 10) * 2.0;
        }

        System.out.println("El costo de estacionamiento es: $" + costo);
    }
}
