using System;

namespace Algoritmo4
{
    class Program
    {
        static void Main()
        {
            int celsius, fahrenheit;
            // Solicitar al usuario la temperatura en grados Celsius
            Console.Write("Ingrese la temperatura en grados Celsius: ");
            celsius = int.Parse(Console.ReadLine());

            // Convertir a grados Fahrenheit
            fahrenheit = celsius * 9 / 5 + 32;

            // Mostrar el resultado
            Console.WriteLine("La temperatura en grados Fahrenheit es: " + fahrenheit);

            // Esperar a que el usuario presione una tecla para salir
            Console.ReadKey();
        }
    }
}