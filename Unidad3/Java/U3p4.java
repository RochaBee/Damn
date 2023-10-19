package com.mycompany.u3p3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3p3 {

    public static void main(String[] args) {
        Scanner day=new Scanner (System.in);
        int dia;
        System.out.println("Introdusca el numero del dia de la semana: ");
        dia=day.nextInt();
        switch(dia){
                case 1:
                    System.out.println("Lunes");
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
                            }
    }
}
