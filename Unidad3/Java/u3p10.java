package com.mycompany.Programa10_U3;
import java.util.Scanner;

public class u3p10 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingrese el pago por hora: $");
        double pagoPorHora = scanner.nextDouble();

        double sueldo = horasTrabajadas * pagoPorHora;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            double pagoHorasExtras = horasExtras * (pagoPorHora * 2);
            sueldo += pagoHorasExtras;
        }

        System.out.println("El sueldo semanal es: $" + sueldo);
    }
}
