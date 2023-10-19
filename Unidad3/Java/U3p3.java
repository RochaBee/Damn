

package com.mycompany.u3p3;
import java.util.Scanner;
public class U3p3 {

    public static void main(String[] args) {//1
              
        Scanner sc = new Scanner(System.in);//1
        int dia; //2
        System.out.print( "Escribe el numero de la semana numerico");
        dia=sc.nextInt();//4
        switch(dia){
        case 1:
        System.out.println("lunes");
        break;
        case 2:
        System.out.println("Martes");
        break;
        case 3:
        System.out.println("Miercoles");
        break;
        case 4:
        System.out.println("Jueves");
        break;
        case 5:
        System.out.println("Viernes");
        break;
        case 6:
        System.out.println("Sabado");
        break;
        case 7:
        System.out.println("Domingo");
        break;
        default:
            System.out.println("No existe el dia ingresado");
    }
        
        
        
    }
}
