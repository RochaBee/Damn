package com.mycompany.programa6;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Programa6 {

    public static void main(String[] args) {
	    Scanner ap = new Scanner(System.in);
		float a, p;
		System.out.println("Ingresa el valor de la altura: ");
		float h = ap.nextFloat();
		System.out.println("Ingresa el valor de la base: ");
		float b = ap.nextFloat();
		System.out.println("Ingresa el valor del lado 1: ");
		float l1 = ap.nextFloat();
		System.out.println("Ingresa el valor del lado 2: ");
		float l2 = ap.nextFloat();
		a = (b * h) / 2;
		p = b + l1 + l2;
		System.out.println("El area es igual a: "+a);
		System.out.println("El perimetro es igual a: "+p);
    }
}
