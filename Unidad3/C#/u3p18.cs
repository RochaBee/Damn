using System;

class Program
{
    static void Main(string[] args)
    {
        double salario = 1500;
        for (int sal = 1; sal <= 6; sal++)
        {
            salario += salario * 0.10;
            Console.WriteLine("El salario en el año " + sal + " es: " + salario);
        }
    }
}