package com.mycompany.programa8;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Programa8 {

    public static void main(String[] args) {
		Scanner me = new Scanner(System.in);
		double f;
		System.out.println("Ingresa los metros a convertir: ");
		double m = me.nextDouble();
		f = m * 3.281;
		System.out.println(m+"m son iguales a: "+f+"ft");
    }
}
