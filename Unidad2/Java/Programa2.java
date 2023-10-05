package com.mycompany.proyecto2;
import java.util.Scanner;
/*
 *
 * @author Angel Rocha Beltran
 */
public class Proyecto2 {//Paso 1

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);// Llamar libreria
        int a, b, suma;//Paso 2-Declarar variables
        System.out.println("Escribe un numero A: ");//Paso 3 
        a = sc.nextInt();//Paso 4-Asignar valor
        System.out.println("Escribe un numero B: ");//Paso 3 
        b = sc.nextInt();//Paso 4-Asignar valor
        suma=a+b;//Paso 5-Operacion
        System.out.println("resultado: "+suma);//Paso 6-Imprimir
    }
}
/*
Libreria "java.util.Scanner;" = Es para usar entrada por teclado en la consola
Asigna a variable "a= sc.nextInt();"
*sc = entrada por teclado
*nextInt(); = conversion
*/
