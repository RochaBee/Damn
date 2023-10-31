package com.mycompany.u3p13;
import java.util.Scanner;
public class U3p13 {

    public static void main(String[] args) {
        Scanner nose = new Scanner (System.in);
        int c, total, num, negativos = 0, positivos = 0;
        System.out.println("Ingresa el total de numeros a procesar: ");
        total=nose.nextInt ();
        
        for (c=1; c<=total; c++){
        System.out.println("Ingresa tu numero: ");
        num=nose.nextInt();
        if (num>0){
            positivos++;
        }
        else if(num<0){
          negativos++;
        }
                System.out.println("Cantidad de numeros Positivos="+positivos);
                System.out.println("Cantidad de numeros Negativos="+negativos);
    }
}
}
