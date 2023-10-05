using System;

namespace P_2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //algoritmo2
            //Inicio
            //Declarar variables
            string nombre = " Roberto Gael ", apellidos = " Ochoa Cervantes ", completo;
            completo = nombre + apellidos;
            Console.WriteLine("* * Bienvenido * * " + completo + " * * " );
            int N1, N2, suma;
            Console.WriteLine("introducir primer numero");
            N1 = Int32.Parse(Console.ReadLine());
            Console.WriteLine("introducir segundo numero");
            N2 = Int32.Parse(Console.ReadLine());
            suma = N1 + N2;
            Console.WriteLine(suma);
            Console.WriteLine(" -- Gracias :)");
        }
    }
}