using System;

namespace Algoritmo2
{
    class Program
    {
        static void Main()
        {
            // Declarar variables
            int y, a, x;

            // Solicitar al usuario que ingrese los valores de y y a
            Console.Write("Ingrese el valor de y: ");
            y = int.Parse(Console.ReadLine());

            Console.Write("Ingrese el valor de a: ");
            a = int.Parse(Console.ReadLine());

            // Calcular
            x = y + a + 3;

            // Mostrar el resultado
            Console.WriteLine("El valor de x es: " + x);

            //Presione una tecla para salir
            Console.ReadKey();
        }
    }
}