package com.mycompany.programa10;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Programa10 {

    public static void main(String[] args) {
		float s, r, m, d;
		Scanner Opt = new Scanner(System.in);
		System.out.println("Ingresa el primer numero: ");
		float N1 = Opt.nextFloat();
		System.out.println("Ingresa el segundo numero: ");
		float N2 = Opt.nextFloat();
		s = N1 + N2;
		r = N1 - N2;
		m = N1 * N2;
		d = N1 / N2;
		System.out.println("La suma de los numeros es: "+s);
		System.out.println("La resta de los numeros es: "+r);
		System.out.println("La multiplicación de los numeros es: "+m);
		System.out.println("La divición de los numeros es: "+d);
    }
}
