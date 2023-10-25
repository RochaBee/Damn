package com.mycompany.u3p12;
import java.util.Scanner;
        
public class U3p12 {

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

int c, total, num;
System.out.println("Ingresa el total de numeros a procesar: ");
total=sc.nextInt ();

for (c=1; c<=total; c++){
System.out.println("Ingresa tu numero: ");
num=sc.nextInt();
System.out.println("Reciduo: "+ num%2);
if (num%2==0)
System.out.println("Par");
else{
System.out.println("Impar");
    }
    }
    }
}