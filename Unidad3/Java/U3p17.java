package com.mycompany.u3p17;
import java.util.Scanner;

public class U3p17 {

    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        char opcion;
        do{
            System.out.println("Bienvenido  a una sola ejecucion");
            System.out.println("Escribe n para salir!!");
            opcion=xd.next().charAt(0);
        }while(opcion != 'n');
        }
}
