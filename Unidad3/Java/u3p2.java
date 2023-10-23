package com.mycompany.Programa2_U3;

import java.util.Scanner;

public class u3p2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int C1,C2,C3,C4,C5,C6,prom;
        System.out.println("Ingresa la 1ra calificacion ");
        C1 =sc.nextInt();
        System.out.println("Ingresa la 2da calificacion ");
        C2 =sc.nextInt();
        System.out.println("Ingresa la 3ra calificacion ");
        C3 =sc.nextInt();
        System.out.println("Ingresa la 4ta calificacion ");
        C4 =sc.nextInt();
        System.out.println("Ingresa la 5ta calificacion ");
        C5 =sc.nextInt();
        System.out.println("Ingresa la 6ta calificacion ");
        C6 =sc.nextInt();
        
        prom=(C1+C2+C3+C4+C5+C6)/6;
        
        if (prom>=70){
        System.out.println("Aprobado"); 
        }
        else{
        System.out.println("Reprobado");
        }
    }
}
