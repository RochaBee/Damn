using System;

namespace Algoritmo5
{
    class Program
    {
        static void Main()
        {
            int metros, pies;
            // Solicitar al usuario la longitud en metros
            Console.Write("Ingrese la longitud en metros: ");
            metros = int.Parse(Console.ReadLine());

            // Convertir a pies
            pies = (int)(metros * 3.28084);

            // Mostrar el resultado
            Console.WriteLine("La longitud en pies es: " + pies);

            // Presione una tecla para salir
            Console.ReadKey();
        }
    }
}