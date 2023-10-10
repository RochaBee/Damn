package com.mycompany.programa11;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Programa11 {

    public static void main(String[] args) {
		float A, P;
		Scanner Hex = new Scanner(System.in);
		
		System.out.println("Ingresa el valor del lado: ");
		float l = Hex.nextFloat();
		P = l * 6;
		System.out.println("Ingresa el valor del apotema: ");
		float a = Hex.nextFloat();
		A = (P * a) / 2;
		System.out.println("El perimetro es igual a: "+P);
		System.out.println("El valor del área es igual a: "+A);
    }
}
