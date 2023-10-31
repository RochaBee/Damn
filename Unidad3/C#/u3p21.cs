using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ingrese la cantidad de números a evaluar:");
        int cantidadNumeros = Convert.ToInt32(Console.ReadLine());
        for (int i = 0; i < cantidadNumeros; i++)
        {
            Console.WriteLine("Ingrese un número natural positivo:");
            int numero = Convert.ToInt32(Console.ReadLine());
            int cubo = numero * numero * numero;
            Console.WriteLine("El cubo del número " + numero + " es: " + cubo);
        }
    }
}