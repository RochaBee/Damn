using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ingrese el valor inicial del ahorro:");
        double ahorroDiario = Convert.ToDouble(Console.ReadLine());
        double ahorroAnual = ahorroDiario;
        for (int dia = 2; dia <= 365; dia++)
        {
            ahorroDiario *= 3;
            ahorroAnual += ahorroDiario;
        }
        Console.WriteLine("Ahorro anual: " + ahorroAnual);
    }
}