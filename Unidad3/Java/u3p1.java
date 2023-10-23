package com.mycompany.Programa1_U3;

import java.util.Scanner;

public class u3p1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int edad;
        System.out.println("escribe tu edad ");
        edad =sc.nextInt();
        if (edad>=18)
        System.out.println("Eres mayor de edad.");
        else
        System.out.println("Eres menor de edad.");
    }
}
