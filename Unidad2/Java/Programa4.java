package com.mycompany.programa4;
import java.util.Scanner;
/**
 *
 * @author angel
 */
        
public class Programa4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double sum = 0;
    double g;
    for (int i = 1; i <= 6; i++) {
      System.out.print("Ingresa la calificación " + i + ": ");
      g = sc.nextDouble();
      sum += g;
    }
    double r = sum / 6;
    System.out.println("El promedio es: " + r);
    }
}
