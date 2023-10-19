package com.mycompany.u3p5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3p5 {

    public static void main(String[] args) {
        Scanner prod=new Scanner(System.in);
        double p1,p2,p3,total;
        System.out.println("Ingrsa el valor del producto 1: ");
        p1=prod.nextDouble();
        System.out.println("Ingrsa el valor del producto 2: ");
        p2=prod.nextDouble();
        System.out.println("Ingrsa el valor del producto 3: ");
        p3=prod.nextDouble();
        total = p1 + p2 + p3;
        if(total>=1500){
         total = total -(total * 0.30);
         System.out.println("El total de su compra (-30%) $"+total);
        }else if (total<1500 && total>1000){
            total = total - (total * 0.20);
            System.out.println("El total de su compra (-20%) $"+total);
            }else if (total<1000 && total>700){
            total = total - (total * 0.10);
            System.out.println("El total de su compra (-10%) $"+total);
            }else{
                    System.out.println("El total de su compra (-0%) $"+total);
                    }
        }
    }
