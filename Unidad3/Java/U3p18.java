package com.mycompany.u3p18;

public class U3p18 {

    public static void main(String[] args) {
        double salario = 1500;
        for(int sal = 1; sal <= 6; sal++) {
            salario += salario * 0.10;
    System.out.println("El salario en el año " + sal + " es: " + salario);
}
    }
}
