package com.mycompany.Programa4_U3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class u3p4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dia;
        System.out.println("Programa para los meses del año.");
        System.out.println("Introdusca un número para saber que mes es: ");
        dia=sc.nextInt();
                switch(dia){
                    case 1:
                        System.out.println("Es enero");
                        break;
                    case 2:
                        System.out.println("Es febrero");
                        break;
                    case 3:
                        System.out.println("Es marzo");
                        break;
                    case 4:
                        System.out.println("Es abril");
                        break;
                    case 5:
                        System.out.println("Es mayo");
                        break;
                    case 6:
                        System.out.println("Es junio");
                        break;
                    case 7:
                        System.out.println("Es julio");
                        break;
                    case 8:
                        System.out.println("Es agosto");
                        break;
                    case 9:
                        System.out.println("Es sepetiembre");
                        break;
                    case 10:
                        System.out.println("Es octubre");
                        break;
                    case 11:
                        System.out.println("Es noviembre");
                        break;
                    case 12:
                        System.out.println("Es diciembre");
                        break;
                }
    }
}
