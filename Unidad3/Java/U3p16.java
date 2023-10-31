package com.mycompany.u3p16;
import java.util.Scanner;
public class U3p16 {

    public static void main(String[] args) {
        Scanner XD = new Scanner (System.in);
        int c=1, hrs, pago, sueldo;
        while (c<=20){
        System.out.println("Captura las horas trabajadas");
        hrs = XD.nextInt();
        System.out.println("Captura el pago por horas");
        pago = XD.nextInt();
        
        sueldo=hrs*pago;
        System.out.println("Tu sueldo es: "+sueldo);
        c++;
    }
    }
}
