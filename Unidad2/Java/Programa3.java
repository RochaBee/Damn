package com.mycompany.programa3;
import java.util.Scanner;
/**
 *
 * @author Angel Rocha Beltran
 */
public class Programa3 {

    public static void main(String[] args) {
        Scanner it = new Scanner (System.in);
        double p1,p2,p3,subtotal,total,ivaT;//asignar
        final double iva=0.16;//valor fijo o constante
        System.out.print("Escribe el precio 1: ");//pedir valor
        p1=it.nextDouble();
        System.out.print("Escribe el precio 2: ");//pedir valor
        p2=it.nextDouble();
        System.out.print("Escribe el precio 3: ");//pedir valor
        p3=it.nextDouble();
        total=p1+p2+p3;//operacion
        ivaT=total*iva;//operacion
        subtotal=total-ivaT;//operacion
        System.out.println("Total: "+total);//Resultado
        System.out.println("Iva: "+ivaT);//Resultado
        System.out.println("Subtotal: "+subtotal);//Resultado
    }
}
