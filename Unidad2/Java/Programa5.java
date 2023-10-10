package com.mycompany.programa5;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Programa5 {
      public static void main(String[] args) {
	    Scanner f = new Scanner(System.in);
		float x;
		System.out.println("Ingresa el numero 'y': ");
		float y = f.nextFloat();
		System.out.println("Ingresa el numero 'a': ");
		float a = f.nextFloat();
		x = y + a + 3;
		System.out.println("La suma de los numeros es: "+x);
    }
}
